package com.learning.enums;

public class T2 {

	// static String s1 = "winter";

	public static void main(String[] args) {
		Season sa = Season.WINTER;
		System.out.println(Direction.EAST);
	}

	static void foo(Season s) {

	}
}

interface i1 {
	void go();
}

enum Season implements i1 {
	WINTER("winter"), SUMMER("summer"), SPRING("spring"), AUTUNM("autunm");

	Season(String s) {
		System.out.println(s);
		System.out.println("enum constructor");
	}

	public void go() {
		System.out.println("Overriding");
	}
}

enum Direction {
	NORTH, SOUTH, EAST, WEST;
	// enum constuctor gets called as many times as the number of constants
	// inside
	Direction() {
		System.out.println("Direction");
	}
}