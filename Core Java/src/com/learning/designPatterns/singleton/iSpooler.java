package com.learning.designPatterns.singleton;

public class iSpooler {
	// this is a prototype for a printer-spooler class
	// such that only one instance can ever exist
	static boolean instance_flag = false; // true if 1 instance

	// the constructor is privatized-
	// but need not have any content
	private iSpooler() {
	}

	// static Instance method returns one instance or null
	static public iSpooler getInstance() {
		if (!instance_flag) {
			instance_flag = true;
			return new iSpooler(); // only callable from within
		} else
			return null; // return no further instances
	}

	// -------------------------------------------
	public void finalize() {
		instance_flag = false;
	}
}
