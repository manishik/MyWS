package com.java8;

@FunctionalInterface
interface MyString {
	String reverseString(String string);
}

public class LambdaReverseStr {
	public static void main(String[] args) {
		// Block lambda to reverse string
		MyString reverseStr = (string) -> {
			String result = "";

			for (int i = string.length() - 1; i >= 0; i--)
				result += string.charAt(i);

			return result;
		};

		// Output: omeD adbmaL
		System.out.println(reverseStr.reverseString("Lambda Reverse String Demo"));
	}
}
