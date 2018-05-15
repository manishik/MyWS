package com.javaInterview.arrays;

public class ReverseChar {

	public static void main(String[] args) {

		String strToReverse = "MyString has spaces and 123 numbers";
		System.out.println("String to Reverse = " + strToReverse);
		char charArray[] = new char[strToReverse.length()];
		
		//Convert String to Char Array
		for (int i = 0; i < strToReverse.length(); i++) {
			charArray[i] = strToReverse.charAt(i);
		}

		char[] revArray = new char[charArray.length];

		//Using while loop
		int i = charArray.length - 1, j = 0;
		while (i >= 0) {
			revArray[j] = charArray[i];
			i--;
			j++;
		}

		//Using for loop
		/*int k = 0;
		for (int m = charArray.length - 1; m >= 0; m--) {
			revArray[k] = charArray[m];
			k++;
		}*/

		System.out.print("Reversed Array = ");
		for (char c : revArray) {
			System.out.print(c);
		}
		
		System.out.println();
		String string = "Manish Indudhar";
		System.out.println("String = " + string);
		StringBuffer stringBuffer = new StringBuffer(string);
		stringBuffer.reverse();
		System.out.println("String reversed = " + stringBuffer);
	}

}
