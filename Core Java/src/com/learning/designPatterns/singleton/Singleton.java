package com.learning.designPatterns.singleton;

public class Singleton {

	private Singleton() {
	}

	private static Singleton uniqueInstance;

	public static synchronized Singleton getInstance() {
		if (uniqueInstance == null) {
			uniqueInstance = new Singleton();
		}
		return uniqueInstance;
	}

}
