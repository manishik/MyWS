package com.learning.designPatterns.singleton;

public class singleSpooler {
	static public void main(String argv[]) {
		PrintSpooler pr1, pr2;
		// open one spooler--this should always work
		System.out.println("Opening one spooler");
		try {
			pr1 = new PrintSpooler();
		} catch (SingletonException e) {
			System.out.println(e.getMessage());
		}
		// try to open another spooler --should fail
		System.out.println("Opening two spoolers");
		try {
			pr2 = new PrintSpooler();
		} catch (SingletonException e) {
			System.out.println(e.getMessage());
		}
	}
}
