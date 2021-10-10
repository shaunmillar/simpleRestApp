package com.example.app.model;

public class Greeting {

	private String message;

	// Required for JSON deserialization
	Greeting() {
	}

	public Greeting(String message) {
		this.message = message;
	}

	public String getMessage() {
		return message;
	}
}
