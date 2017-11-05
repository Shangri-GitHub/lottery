package com.lottery.controller;

import io.swagger.annotations.Api;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.servlet.ModelAndView;

@Controller
@Api(value = "index")
@RequestMapping("/index")
public class IndexController {

	private Logger log = LoggerFactory.getLogger(getClass());
	

	@RequestMapping(value = "/", method = RequestMethod.GET)
	public ModelAndView index() {
		ModelAndView view = new ModelAndView("index");
		
		return view;
		
	}
	
}
