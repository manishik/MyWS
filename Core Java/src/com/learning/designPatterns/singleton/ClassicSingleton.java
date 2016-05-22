package com.learning.designPatterns.singleton;

public class ClassicSingleton {

	private ClassicSingleton() {
	}

	private static ClassicSingleton instance = null;

	public static synchronized ClassicSingleton getInstance() {
		if (instance == null) {
			instance = new ClassicSingleton();
		}
		return instance;
	}
}
