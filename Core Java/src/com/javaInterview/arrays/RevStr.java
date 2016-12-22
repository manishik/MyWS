package com.javaInterview.arrays;

public class RevStr {

	public static void main(String[] args) {
		String str = "Manish Keshav";

		char charArray[] = new char[str.length()];
		int j = 0;
		for (int i = str.length() - 1; i >= 0; i--) {
			charArray[j] = str.charAt(i);
			j++;
		}

		for (char c : charArray) {
			System.out.print(c);
		}
	}

}
