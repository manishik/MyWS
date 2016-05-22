package com.javaInterview.string;

public class StrToCharArray {

	public static void main(String[] args) {

		String str = "Test String";

		char charArray[] = new char[str.length()];
		for (int i = 0; i < str.length(); i++) {
			charArray[i] = str.charAt(i);
			// System.out.print(charArray[i]);
		}

		//Print the Character Array  
		for (int j = 0; j < charArray.length; j++) {
			System.out.print(charArray[j]);
		}

		System.out.println();
		
		char aCharArray[] = str.toCharArray();
		System.out.println(aCharArray);
		System.out.println(aCharArray.length);
	}
}
