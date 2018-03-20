package com.example.demo;

import java.util.Map;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;

@Controller
public class SpringController {
	//@Value("${welcome.message:test}")
	private String message="Hello world";
	
	@RequestMapping("/")
	public String hello(Map<String, Object> model) {
		model.put("message", this.message);
		return "welcome";
	}
}