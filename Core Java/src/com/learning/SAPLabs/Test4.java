package com.learning.SAPLabs;

public class Test4 {

	public static String var = "Six";

	static {
		System.out.println("Ten");
		var = "Nine";
	}

	Test4() {
		System.out.println("Five");
	}

	Test4(String string) {
		this();
		System.out.println(var);
		var = string;
	}

	private void getVar() {
		System.out.println(var);
	}

	public static void main(String[] args) {

		Test4 test4 = new Test4("Seven");
		test4.getVar();

	}

}
