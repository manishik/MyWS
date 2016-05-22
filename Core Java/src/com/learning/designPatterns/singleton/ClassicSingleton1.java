package com.learning.designPatterns.singleton;

public class ClassicSingleton1 {

	private static ClassicSingleton1 instance = new ClassicSingleton1();

	private ClassicSingleton1() {
	}

	public static synchronized ClassicSingleton1 getInstance() {
		return instance;
	}
}
