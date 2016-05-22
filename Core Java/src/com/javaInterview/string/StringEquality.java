package com.javaInterview.string;

public class StringEquality {

	public static void main(String[] args) {
		System.out.println("String Equality " + System.getProperty("line.separator"));
		System.out.println("When the new keyword is used");
		String s3 = new String("Manish");
		String s4 = new String("Manish");
		System.out.println("==       " + (s3 == s4));
		System.out.println("equals   " + s3.equals(s4));

		System.out.println();

		System.out.println("When new keyword is NOT used");
		String s1 = "Nandini";
		String s2 = "Nandini";
		System.out.println("==       " + (s1 == s2));
		System.out.println("equals   " + (s1.equals(s2)));
	}
}
