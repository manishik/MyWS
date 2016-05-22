package com.javaInterview.string;

public class StrNullCheck {

	static String s3;

	String s4;

	public static void main(String[] args) {
		String s1 = null;
		if (s1 == null) {
			System.out.println("null");
		} else {
			System.out.println("Not null");
		}

		/*if (s1.equals(null)) { // NullPointerException
			System.out.println("null");
		} else {
			System.out.println("Not null");
		}*/

		String s2 = "";
		if (s2 == null) {
			System.out.println("null");
		} else {
			System.out.println("Not null");
		}

		if (s2.equals(null)) {
			System.out.println("null");
		} else {
			System.out.println("Not null");
		}

		// static string variable
		if (s3 == null) {
			System.out.println("null");
		} else {
			System.out.println("Not null");
		}

		/*if (s3.equals(null)) { // NullPointerException
			System.out.println("null");
		} else {
			System.out.println("Not null");
		}*/

		// instance string variable
		if (new StrNullCheck().s4 == null) {
			System.out.println("null");
		} else {
			System.out.println("Not null");
		}

	}

}
