package com.java8;

public class Lambda1 {
	public static void main(String[] args) {
		// Block lambda to reverse string
		MyString reverseStr = (str) -> {
			String result = "";
			
			for(int i = str.length()-1; i >= 0; i--)
				result += str.charAt(i);
			
			return result;
		};
		
		// Output: omeD adbmaL
		System.out.println(reverseStr.myStringFunction("Lambda Demo")); 
	}
}

interface MyString {
	String myStringFunction(String str);
}