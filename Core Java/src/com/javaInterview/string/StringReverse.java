package com.javaInterview.string;

public class StringReverse {
	public static void main(String[] args) {
		String revString = reversing("Manish is very Smart");
		System.out.println("Reversed String using fuctions = " + revString);

		String revStr = reverse("Manish is a Jack ass");
		System.out.println("Reversed String = " + revStr);
	}

	static String reverse(String string) {
		System.out.println("String = " + string);
		String reversedString = new String();
		for (int i = string.length() - 1; i >= 0; i--) { // Reverse Iteration
			reversedString = reversedString + string.charAt(i);
		}
		return reversedString;
	}

	static String reversing(String string) {
		System.out.println("String = " + string);
		StringBuffer stringBuffer = new StringBuffer(string);
		return stringBuffer.reverse().toString();
	}
}
