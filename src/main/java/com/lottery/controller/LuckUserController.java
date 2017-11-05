package com.lottery.controller;

import io.swagger.annotations.Api;
import io.swagger.annotations.ApiImplicitParam;
import io.swagger.annotations.ApiImplicitParams;
import io.swagger.annotations.ApiOperation;

import java.util.Date;
import java.util.UUID;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.MediaType;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;

import com.lottery.dao.mybatis.model.AccessToken;
import com.lottery.dao.mybatis.model.LuckUser;
import com.lottery.exception.HttpStatus400Exception;
import com.lottery.exception.HttpStatus404Exception;
import com.lottery.service.AccessTokenService;
import com.lottery.service.LuckUserService;
import com.lottery.utils.CheckUtils;
import com.lottery.utils.DateUtil;
import com.lottery.utils.MD5Util;
import com.lottery.web.form.request.LuckUserLoginReq;
import com.lottery.web.form.response.LuckUserLoginResp;

@Api(value = "luckuser")
@RestController
@RequestMapping("/api/v1/luckuser/")
public class LuckUserController {

	private Logger log = LoggerFactory.getLogger(getClass());

	@Autowired
	LuckUserService luckUserService;

	@Autowired
	AccessTokenService accessTokenService;

	@ApiOperation(value = "登录")
	@ApiImplicitParams({
	// @ApiImplicitParam(paramType = "query", name = "name", value = "姓名",
	// dataType = "String")
	@ApiImplicitParam(paramType = "body", name = "luckUserLoginReq", value = "登录请求体", dataType = "LuckUserLoginReq") })
	@RequestMapping(value = "login", method = RequestMethod.POST, produces = MediaType.APPLICATION_JSON_UTF8_VALUE)
	public LuckUserLoginResp user(@RequestBody LuckUserLoginReq luckUserLoginReq) throws HttpStatus400Exception, HttpStatus404Exception {
		String userName = luckUserLoginReq.getUserName();
		String password = luckUserLoginReq.getPassword();
		if(CheckUtils.isEmpty(userName)) {
			throw new HttpStatus400Exception("请输入登录名", "400", "缺少userName参数", "");
		}
		if(CheckUtils.isEmpty(password)) {
			throw new HttpStatus400Exception("请输入密码", "400", "缺少password参数", "");
		}
		
		LuckUser exist = luckUserService.selectByUserName(userName);
		if(CheckUtils.isEmpty(exist)) {
			throw new HttpStatus404Exception("输入的用户不存在", "404", "输入的用户不存在", "");
		}
		if(!password.equalsIgnoreCase(exist.getPassword())) {
			throw new HttpStatus400Exception("输入的用户名或密码有误", "400", "输入的用户名或密码有误", "");
		}
		
		
		return generateLoginToken(userName);
	}
	
	
	//每次生成有效期一个月
	private LuckUserLoginResp generateLoginToken(String userName) {
		AccessToken existAccessToken = accessTokenService.selectByUserName(userName);
		if(CheckUtils.isEmpty(existAccessToken)) {
			//生成accessToken
			AccessToken create = new AccessToken();
			create.setUserName(userName);
			Date createTime = new Date();
			create.setCreateTime(createTime);
			
			Date  expireTime = DateUtil.getExpireTime(createTime);
			create.setExpireTime(expireTime);
			
			String accessToken = getAccessToken(userName);
			
			create.setAccessToken(accessToken);
			
			accessTokenService.insert(create);
			LuckUserLoginResp resp = new LuckUserLoginResp();
			resp.setUserName(userName);
			resp.setAccessToken(accessToken);
			resp.setExpireTime(expireTime);
			return resp;
		}
		//更新时间
		AccessToken update = new AccessToken();
		update.setId(existAccessToken.getId());
		Date  expireTime = DateUtil.getExpireTime(new Date());
		update.setExpireTime(expireTime);
		
		String accessToken = getAccessToken(userName);
		update.setAccessToken(accessToken);
		
		accessTokenService.update(update);
		
		LuckUserLoginResp resp = new LuckUserLoginResp();
		resp.setUserName(userName);
		resp.setAccessToken(accessToken);
		resp.setExpireTime(expireTime);
		
		return resp;
	}
	
	
	private String getAccessToken(String userName) {
		StringBuilder token = new StringBuilder(MD5Util.encrypt(userName));
		token.append("-");
		token.append( MD5Util.encrypt(UUID.randomUUID().toString()) );
		
		String accessToken = token.toString();
		return accessToken;
	}
	
	public static void main(String[] args) {
		System.out.println(MD5Util.encrypt ( UUID.randomUUID().toString()) );
	}
	
//
//	@ApiImplicitParams({
//			@ApiImplicitParam(paramType = "query", name = "token", value = "", dataType = "String"),
//			@ApiImplicitParam(paramType = "query", name = "name", value = "姓名", dataType = "String"),
//			@ApiImplicitParam(paramType = "query", name = "pageSize", value = "", dataType = "Integer"),
//			@ApiImplicitParam(paramType = "query", name = "pageIndex", value = "页码", dataType = "Integer") })
//	@RequestMapping(value = "/usersWithPaginate", method = RequestMethod.GET, produces = MediaType.APPLICATION_JSON_UTF8_VALUE)
//	public PageInfo<User> patientsWithPaginate(
//			@RequestParam(value = "token", required = false, defaultValue = "test") String token,
//			@RequestParam(value = "name", required = true) String name,
//			@RequestParam(value = "pageSize", required = false, defaultValue = "15") Integer pageSize,
//			@RequestParam(value = "pageIndex", required = false, defaultValue = "1") Integer pageIndex) {
//
//		PageHelper.startPage(pageIndex, pageSize);
//
//		List<User> users = userService.selectUsersByLikeName(name);
//
//		return new PageInfo<User>(users);
//	}

}
