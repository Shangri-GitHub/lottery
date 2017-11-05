package com.lottery.controller;

import io.swagger.annotations.Api;
import io.swagger.annotations.ApiImplicitParam;
import io.swagger.annotations.ApiImplicitParams;
import io.swagger.annotations.ApiOperation;

import com.lottery.dao.mybatis.model.User;
import com.lottery.service.UserService;
import java.util.List;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.MediaType;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

import com.github.pagehelper.PageHelper;
import com.github.pagehelper.PageInfo;

//@Controller
@Api(value = "user")
@RestController
@RequestMapping("/api/v1/user/")
public class UserController {

	private Logger log = LoggerFactory.getLogger(getClass());
	
	@Autowired
	UserService userService;

	@ApiOperation(value = "测试")
	@ApiImplicitParams({
		@ApiImplicitParam(paramType = "query", name = "name", value = "姓名", dataType = "String") 
	})
	@RequestMapping(value = "/user/{id}", method = RequestMethod.GET, produces = MediaType.APPLICATION_JSON_UTF8_VALUE)
	public User user(
			@RequestParam(value = "token", required = false, defaultValue = "test") String token,
			@PathVariable("id") Long id) {
		
		return userService.selectById(id);
	}

	@ApiImplicitParams({
			@ApiImplicitParam(paramType = "query", name = "token", value = "", dataType = "String"),
			@ApiImplicitParam(paramType = "query", name = "name", value = "姓名", dataType = "String"),
			@ApiImplicitParam(paramType = "query", name = "pageSize", value = "", dataType = "Integer"),
			@ApiImplicitParam(paramType = "query", name = "pageIndex", value = "页码", dataType = "Integer") })
	@RequestMapping(value = "/usersWithPaginate", method = RequestMethod.GET, produces = MediaType.APPLICATION_JSON_UTF8_VALUE)
	public PageInfo<User> patientsWithPaginate(
			@RequestParam(value = "token", required = false, defaultValue = "test") String token,
			@RequestParam(value = "name", required = true) String name,
			@RequestParam(value = "pageSize", required = false, defaultValue = "15") Integer pageSize,
			@RequestParam(value = "pageIndex", required = false, defaultValue = "1") Integer pageIndex) {

		PageHelper.startPage(pageIndex, pageSize);

		List<User> users = userService.selectUsersByLikeName(name);
		
		return new PageInfo<User>(users);
	}
	
	
}
