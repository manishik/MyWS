package com.learning.scjpDumpPdfExamples;

public class Boxer1 {
	Integer i; //No default value
	int x; //Gets default value 0

	public Boxer1(int y) {

		x = x + y; // Result is 4
		System.out.println(x);

		x = i + y; //java.lang.NullPointerException
		System.out.println(x);

	}

	/*public Boxer1(Integer i1) {
		x = x + i1;
		System.out.println(x);
	}*/

	public static void main(String[] args) {
		new Boxer1(new Integer(4));
		//new Boxer1(3);
	}
}