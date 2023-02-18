package com.study.securitycloud.user.controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.ResponseBody;
import org.springframework.web.bind.annotation.RestController;

import lombok.extern.slf4j.Slf4j;

@Slf4j
@RestController
@RequestMapping(value = "/")
public class UserController {

	@ResponseBody
	@RequestMapping(value = "main", method = RequestMethod.GET)
	public String mainPage(){
		log.info("access success");
		return "hello!";
	}
}
