package com.learning.Exceptions.Chaining;

public class someExClass {

	public static void main(String[] args) {
		someMethod();
	}
	
	static void someMethod(){
		int a = 0, b = 20;
		System.out.println(b/a);
	}

}
