package com.study.securitycloud.user.controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;

@Controller
@RequestMapping(name = "/")
public class UserController {

	@GetMapping
	public String mainPage(){
		return "hi";
	}
}
