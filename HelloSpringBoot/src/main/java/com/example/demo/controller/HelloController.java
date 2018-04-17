package com.example.demo.controller;

import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class HelloController {
	
	@RequestMapping("/hello")
	public Object sayHello() {
		return "Hello Spring-Boot!";
	}
	
	@RequestMapping("/user")
	public Object getUser() {
		return "Hello Spring-Boot!";
	}


}
