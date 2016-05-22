package com.javaInterview.sort_search;

public class BubbleSort {

	public static void main(String[] args) {
		int[] numbers = { 300, 5, 8, 14, 1, 5678 };
		int numberz[]  = new int[]{ 67, 8, 2, 23, 0, 45745, 3954, 345, 55 };
		bubblesort(numberz);
	}

	static void bubblesort(int[] intArray) {
		int tempInt;
		int arrayLength = intArray.length;
		for (int i = 0; i < arrayLength; i++) {
			for (int j = 1; j < arrayLength; j++) {
				if (intArray[j] < intArray[j - 1]) {
					tempInt = intArray[j - 1];
					intArray[j - 1] = intArray[j];
					intArray[j] = tempInt;
				}
			}
		}
		for (int i = 0; i < intArray.length; i++) {
			System.out.println(intArray[i]);
		}

	}

}
