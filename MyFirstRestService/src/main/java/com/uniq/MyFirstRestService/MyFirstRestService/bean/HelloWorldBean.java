package com.uniq.MyFirstRestService.MyFirstRestService.bean;

public class HelloWorldBean {

	private String message;

	private String dummyMessage;

	public HelloWorldBean(String message, String dummyMessage) {
		super();
		this.message = message;
		this.dummyMessage = dummyMessage;
	}

	public String getMessage() {
		return message;
	}

	public String getDummyMessage() {
		return dummyMessage;
	}

	@Override
	public String toString() {
		return "HelloWorldBean [message=" + message + ", dummyMessage=" + dummyMessage + "]";
	}

}
