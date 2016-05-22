package com.javaInterview.statics;

public class StaticBlocks {

	static int i = 50, j;
	static String s1 = "String";

	public static void main(String[] args) {
		System.out.println(i + " " + j);
		System.out.println(s1);
	}

	static { // Static variables of class gets re-initialized in the static block
		i = 55;
		s1 = "String Changed";
		System.out.println("Static block runs first");
	}
}
