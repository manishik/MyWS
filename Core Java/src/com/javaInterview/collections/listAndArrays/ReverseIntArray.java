package com.javaInterview.collections.listAndArrays;

public class ReverseIntArray {

	public static void main(String[] args) {

		System.out.println("Wrapper class Integer Array");
		Integer[] integerArray = { 23, 34, 45, 56 };
		for (int i : integerArray) {
			System.out.print(" " + i);
		}
		System.out.println();
		System.out.println("Reversed Integer Array");
		
		Integer[] reversedIntegerArray = new Integer[integerArray.length];
		int j = integerArray.length - 1;
		for (int i = 0; i < integerArray.length; i++) {
			reversedIntegerArray[i] = integerArray[j];
			j--;
			System.out.print(" " + reversedIntegerArray[i]);
		}

		System.out.println();
		System.out.println("Primitive int Array");
		int[] intArray = { 1, 2, 3, 4, 5 };
		for (int i : intArray) {
			System.out.print(" " + i);
		}
		System.out.println();
		System.out.println("Reversed int Array");

		// *************Reversing Type 1 ***************
		int[] reversedIntArray = new int[intArray.length];
		int k = 0;
		for (int i = (intArray.length - 1); i >= 0; i--) //reverse iterate  
		{
			reversedIntArray[k] = intArray[i];
			k++;
		}
		for (int i : reversedIntArray) {
			System.out.print(" " + i);
		}
		
		System.out.println();
		System.out.println("Reversed int Array");
		
		// *************Reversing Type 2 ***************
		int[] revArray = new int[intArray.length];
		for (int i = (intArray.length) - 1; i >= 0;) {
			for (int l = 0; l <= (revArray.length) - 1; l++) {
				revArray[l] = intArray[i];
				i--;
			}
		}
		
		for (int i : revArray) {
			System.out.print(" " + i);
		}

	}

}
