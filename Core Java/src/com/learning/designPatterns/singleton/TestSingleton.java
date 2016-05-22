package com.learning.designPatterns.singleton;

public class TestSingleton {

	public static void main(String[] args) {
		MySingleton obj = MySingleton.getInstance();
		MySingleton obj1 = MySingleton.getInstance();
		System.out.println("" + obj.equals(obj1));
		System.out.println(obj == obj1);
		
		ServiceLocator cs = ServiceLocator.getInstance();
		ServiceLocator cs1 = ServiceLocator.getInstance();
		System.out.println("" + cs.equals(cs1));
		System.out.println(cs == cs1);
	}
}
