package com.learning.scjpDumpPdfExamples;

public class T10 {

	public static void main(String[] args) {
		test(""); //String is empty
		test("1"); //String is not empty
		test(null); //Runtime Exception //java.lang.NullPointerException
	}

	public static void test(String str) {
		if (str == null | str.length() == 0) {
			System.out.println("String is empty");
		} else {
			System.out.println("String is not empty");
		}
	}
}
