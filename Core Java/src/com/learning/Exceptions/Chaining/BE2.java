package com.learning.Exceptions.Chaining;

public class BE2 extends BE1 {

	String mistake;

	public BE2() {
		super();
		mistake = "Unknown";
	}

	public BE2(String message) {
		super(message);
		mistake = message;
	}

	public String getError() {
		return mistake;
	}
}
