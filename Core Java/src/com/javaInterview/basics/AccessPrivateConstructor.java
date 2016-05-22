package com.javaInterview.basics;

import java.lang.reflect.Constructor;

public class AccessPrivateConstructor {

	public static void main(String[] args) throws Exception {

		Class c1 = Class.forName("com.javaInterview.basics.SomeClassWithPrivateConstructor");

		Constructor constructor = c1.getDeclaredConstructor();

		constructor.setAccessible(true);

		constructor.newInstance();

	}

}

class SomeClassWithPrivateConstructor {
	private String name;

	private SomeClassWithPrivateConstructor() {
		System.out.println("Private Constructor of SomeClassWithPrivateConstructor");
		int sal = 10000;
		System.out.println("Sal = " + sal);
		name = "Manish";
		System.out.println(name);
	}
}