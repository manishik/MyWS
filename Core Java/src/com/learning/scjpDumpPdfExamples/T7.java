package com.learning.scjpDumpPdfExamples;

public class T7 {

	static void test() {
		try {
			System.out.println("in test()");
			String x = null;
			System.out.println(x.toString() + " ");
		} finally {
			System.out.println("finally ");
		}
	}

	public static void main(String[] args) {
		try {
			System.out.println("in main()");
			test();
		} catch (Exception ex) {
			System.out.println("exception ");
		}
	}

	static{
		System.out.println("static block always runs first");
	}
	
}
