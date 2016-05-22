package com.learning.assorted;

import java.util.*;

public class Ran extends commingToCoffee {
	public static void main(String[] args) {
		System.out.println("Inside Ran Class");
		List<String> argList = Arrays.asList(args);
		Collections.shuffle(argList);
		for (String arg : argList) {
			System.out.format("%s ", arg);
		}
	}

	public void main() {

	}

	void go() {
		// TODO Auto-generated method stub
	}
}

abstract class commingToCoffee {

	public static void main(String[] args) {
		boolean deepti = true;
		if (deepti == true) {
			System.out.println("Come to the Pantry next to ODC 11 by 12 noon");
		} else {
			System.out.println("I'm going alone");
		}
	}

	abstract void go();

	abstract class anotherAbstractClass {

	}
}

class YouDumbAss {
	
	char idiot;
	double weight;
	short tempered;
	long gossip;

	public static void main(String[] args) {
		boolean deepti = true; //variable Deepti/Ammanue can only have values true or false 
		if (deepti == true) {
			System.out.println("Come to the Pantry next to ODC 11 by 4 noon");
		} else {
			System.out.println("I'll go enjoy corns alone");
		}
	}

}
