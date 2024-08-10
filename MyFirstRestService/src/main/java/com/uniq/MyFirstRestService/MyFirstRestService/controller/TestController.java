package com.uniq.MyFirstRestService.MyFirstRestService.controller;

import java.lang.reflect.Method;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpMethod;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;
import org.springframework.web.client.RestTemplate;

@RestController
public class TestController {

	@Autowired
	private RestTemplate restTemplate;

	// http://localhost:8080/add ==> 1
	@GetMapping(value = "/add")
	public ResponseEntity<Integer> add() {

		return restTemplate.exchange("http://localhost:8080/prod", HttpMethod.GET, null, Integer.class);
	}

	// http://localhost:8080/prod ==> 2

	@GetMapping(value = "/prod")
	public int prod() {

		return 1 * 2;
	}

}
