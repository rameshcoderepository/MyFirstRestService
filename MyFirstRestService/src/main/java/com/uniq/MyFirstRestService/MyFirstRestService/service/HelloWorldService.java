package com.uniq.MyFirstRestService.MyFirstRestService.service;

import org.springframework.stereotype.Service;

import com.uniq.MyFirstRestService.MyFirstRestService.bean.HelloWorldBean;

@Service
public class HelloWorldService {

	public HelloWorldBean getHelloWorldBean() {
		return new HelloWorldBean("Hello, World! - From Bean", "dummy Message");
	}
}
