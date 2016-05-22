package com.javaInterview.exceptions;

public class TryReturns {

	public static void main(String[] args) {
		System.out.println("Result = " + new TryReturns().someMethod());
	}

	public String someMethod() {
		String string = "Hey";
		try {
			System.out.println("In try...");
			return oneMoreMethod();
		} catch (Exception exception) {
			System.out.println("In catch...");
		} finally {
			System.out.println("finally...");
		}
		if (true) {
			System.out.println("Inside if..");
			return oneMoreMethod();
		}
		System.out.println("End of method..");
		return string;
	}

	public String oneMoreMethod() {
		return "Howdi";
	}

}
