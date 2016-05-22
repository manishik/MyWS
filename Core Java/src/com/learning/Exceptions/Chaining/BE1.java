package com.learning.Exceptions.Chaining;

public class BE1 extends Exception {

	String error;

	public BE1() {
		super();
		error = "Unknown";
	}

	public BE1(String message) {
		super(message);
		error = message;
	}

	public String getError() {
		return error;
	}
}
