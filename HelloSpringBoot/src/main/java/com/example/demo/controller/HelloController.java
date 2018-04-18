package com.example.demo.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.data.redis.core.StringRedisTemplate;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class HelloController {
	
	@Autowired
	private StringRedisTemplate srt;
	
	@RequestMapping("/hello")
	public Object sayHello() {
		//String user =  srt.opsForValue().get("user");
		//System.out.println(user);
		srt.opsForValue().set("json:name", "{name:'yangsong'}");
		return "Hello Spring-Boot!";
	}

}
