package com.javaInterview.collections;

public class ArrayExample {

	public static void main(String[] args) {

		String[] strArray = new String[] { "Java", "Manish", "And", "and" };

		String[] anotherArray = { "Hey", "This", "is", "Testing" };

		// Display the contents of String Array by iteration
		for (int i = 0; i < anotherArray.length; i++) {
			System.out.println(anotherArray[i]);
		}
		System.out.println("String Array = " + strArray);
		System.out.println("First element of String Array = " + strArray[0]);

		int[] anIntArray = { 100, 200, 300, 400, 500, 600, 700, 800, 900, 1000 };

	}

}
