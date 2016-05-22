package com.javaInterview.designPatters;

public class ServiceLocator {

	private ServiceLocator() {
	}
	
	private static ServiceLocator instance;

	public static synchronized ServiceLocator getInstance() {
		if (instance == null) {
			instance = new ServiceLocator();
		}
		return instance;
	}
}