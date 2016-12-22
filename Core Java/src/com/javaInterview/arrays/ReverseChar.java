package com.javaInterview.arrays;

public class ReverseChar {

	public static void main(String[] args) {

		String str = "MyString has spaces and 123 numbers";
		System.out.println("String = " + str);
		char charArray[] = new char[str.length()];
		for (int i = 0; i < str.length(); i++) {
			charArray[i] = str.charAt(i);
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
