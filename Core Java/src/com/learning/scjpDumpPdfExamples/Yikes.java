package com.learning.scjpDumpPdfExamples;

public class Yikes {

	public static void go(Long n) {
		System.out.println("Long ");
	}

	public static void go(Short n) {
		System.out.println("Short ");
	}

	public static void go(int n) {
		System.out.println("int ");
	}

	public static void main(String[] args) {
		short y = 6;
		long z = 7;
		go(y);
		go(z);
		//System.out.format("Pi is approximately %d.", Math.PI); //Runtime Exception
	}
}
