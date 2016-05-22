package com.learning.designPatterns.singleton;

public class MySingleton {
	
	/** Singleton instance */
	private static MySingleton instance;
	
	// Static block to instantiate the singleton in a threadsafe way
	static {
		instance = new MySingleton();
	} // static initializer
	
	/**
	 * Enforces singleton method. Returns the instance of this object.
	 * 
	 * @throws DataImportationException
	 *             if there was an internal error creating the singleton
	 * @return the singleton instance of this class
	 */
	public static MySingleton getInstance() {
		return instance;
	}
	
	/**
	 * Private constructor to enforce singleton design pattern.
	 */
	private MySingleton() {
	
	}
}