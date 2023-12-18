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

	public void setMessage(String message) {
		this.message = message;
	}

	public String getDummyMessage() {
		return dummyMessage;
	}

	public void setDummyMessage(String dummyMessage) {
		this.dummyMessage = dummyMessage;
	}

	@Override
	public String toString() {
		return "HelloWorldBean [message=" + message + ", dummyMessage=" + dummyMessage + "]";
	}

}
