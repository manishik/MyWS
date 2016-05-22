package com.learning.designPatterns.singleton;

public class PrintSpooler {
	// this is a prototype for a printer-spooler class
	// such that only one instance can ever exist
	static boolean instance_flag = false; // true if 1 instance

	public PrintSpooler() throws SingletonException {
		if (instance_flag)
			throw new SingletonException("Only one spooler allowed");
		else
			instance_flag = true; // set flag for 1 instance
		System.out.println("spooler opened");
	}

	// -------------------------------------------
	public void finalize() {
		instance_flag = false; // clear if destroyed
	}
}
