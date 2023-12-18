package com.uniq.MyFirstRestService.MyFirstRestService.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.uniq.MyFirstRestService.MyFirstRestService.service.GreetingService;

@RestController
@RequestMapping("/api")
public class GreetingController {

	@Autowired
	private GreetingService greetingService;

	@GetMapping("/greeting")
	public String getGreeting() {
		return greetingService.getGreeting();
	}
}
