package com.uniq.MyFirstRestService.MyFirstRestService.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.uniq.MyFirstRestService.MyFirstRestService.service.GreetingService;

//http://localhost:8080/api
@RestController
@RequestMapping("/api")
public class GreetingController {

	@Autowired
	private GreetingService greetingService;

	//http://localhost:8080/api/greeting
	@GetMapping("/greeting")
	public String getGreeting1() {
		return greetingService.getGreeting();
	}
	
	//http://localhost:8080/api/greeting1
	@GetMapping("/greeting1")
	public String getGreeting2() {
		return "dummy message 1";
	}
	
	//http://localhost:8080/api/greeting2
	@GetMapping("/greeting2")
	public String getGreeting3() {
		return "dummy message 2";
	}
}
