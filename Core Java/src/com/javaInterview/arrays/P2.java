package com.javaInterview.arrays;

/* Manish K Indudhar */

public class P2 {

	public static void main(String[] args) {
		int ofRotate = 2; 
		String string = "MyString";
		String newString = string.substring(string.length() - ofRotate) + string.substring(0, string.length() - ofRotate);
		System.out.println(newString);
	}

}
