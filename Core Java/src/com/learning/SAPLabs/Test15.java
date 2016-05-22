package com.learning.SAPLabs;

public class Test15 {

	int var;

	Test15(double var) {
		this.var = (int) (var);
	}

	Test15(int var) {
		this("Hello");
	}

	Test15(String s) {
		this();
		System.out.println(s);
	}

	Test15() {
		System.out.println("good-bye");
	}

	public static void main(String[] args) {

		Test15 test15 = new Test15(5);

	}

}
