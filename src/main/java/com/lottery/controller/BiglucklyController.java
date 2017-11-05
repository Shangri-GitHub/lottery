package com.lottery.controller;

import io.swagger.annotations.Api;
import io.swagger.annotations.ApiImplicitParam;
import io.swagger.annotations.ApiImplicitParams;
import io.swagger.annotations.ApiOperation;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.MediaType;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;

import com.lottery.dao.mybatis.model.Bigluckly;
import com.lottery.exception.HttpStatus401Exception;
import com.lottery.service.BiglucklyService;


//@Controller
@Api(value = "bigluckly")
@RestController
@RequestMapping("/api/v1/bigluckly/")
public class BiglucklyController {

	private Logger log = LoggerFactory.getLogger(getClass());
	
	@Autowired
	BiglucklyService biglucklyService;

	@ApiOperation(value = "根据大乐透id获取详情")
	@ApiImplicitParams({
		@ApiImplicitParam(paramType = "path", name = "id", value = "id", dataType = "Integer")
		//,@ApiImplicitParam(paramType = "query", name = "name", value = "姓名", dataType = "String") 
	})
	@RequestMapping(value = "/{id}", method = RequestMethod.GET, produces = MediaType.APPLICATION_JSON_UTF8_VALUE)
	public Bigluckly user(
			@PathVariable("id") Long id) throws HttpStatus401Exception {
		if( new Long(1).equals(id)) {
			throw new HttpStatus401Exception("401", "401", "401", "401");
		}
		return biglucklyService.selectById(id);
	}
	
}
