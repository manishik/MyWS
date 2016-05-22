package com.learning.Exceptions.Chaining;

public class BE3 extends BE2 {

	String fault;

	public BE3() {
		super();
		fault = "Unknown";
	}

	public BE3(String message) {
		super(message);
		fault = message;
	}

	public String getError() {
		return fault;
	}
}
