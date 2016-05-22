package com.learning.string;

public class P1 {

	public static void main(String[] args) {
		String s1 = "UK:I:14";
		String s2 = s1.substring(5, s1.length());
		System.err.println("deal Id = " + s2);

		for (int i = 0; i < s1.length(); i++) {
			System.out.println(s1.charAt(i));
		}
	}

}
