package com.uniq.MyFirstRestService.MyFirstRestService.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.uniq.MyFirstRestService.MyFirstRestService.bean.HelloWorldBean;
import com.uniq.MyFirstRestService.MyFirstRestService.service.HelloWorldService;

@RestController
@RequestMapping("/api")
public class HelloWorldController {

	@Autowired
	private HelloWorldService helloWorldService;

	@GetMapping("/helloworld")
	public HelloWorldBean getGreeting() {
		return helloWorldService.getHelloWorldBean();
	}
	
	
}
