package com.learning.Z;

class Foo {
	static boolean condition;

	public static void main(String[] args) {

		int i = 0;
		if ((++i >= 1) || (condition == false))
			i++;
		System.out.println("i = "+i);
		if ((i++ > 1) && (condition = true))
			i++;
		System.out.println(i);
	}
}