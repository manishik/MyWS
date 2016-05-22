package com.learning.assorted;

public class Shadowing {

	private int i = 10;

	public static void main(String[] args) {
		final int i = 100;
		System.out.println(i);
		Shadowing s = new Shadowing();
		System.out.println("before = " + s.i);
		s.setI(500);
		System.out.println("after = " + s.i);
		s.foo();
		System.out.println(i);
		System.out.println(s.i);
	}

	void setI(int i) {
		this.i = i;
	}

	int foo() {
		int i = 200;
		System.out.println(i);
		return i;
	}
}
