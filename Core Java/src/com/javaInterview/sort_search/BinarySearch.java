package com.javaInterview.sort_search;

public class BinarySearch {

	public static void main(String[] args) {

		int array[] = {55, 44, 91, 12, 789, 480, 921, 6644, 889};

		System.out.println("Given Array = ");
		for (int i = 0; i < array.length; i++) {
			System.out.print(" " + array[i]);
		}
		System.out.println();
		
		int indexPos = binarySearch(array, 0, array.length, 921);
		System.out.println("Result = " + indexPos);

	}

	public static int binarySearch(int[] array, int firstIndex, int lastIndex, int key) {
		int middleIndex;
		while (true) {
			middleIndex = (firstIndex + lastIndex) / 2;
			if (key < array[middleIndex]) {
				lastIndex = middleIndex - 1;
			} else if (key > array[middleIndex]) {
				firstIndex = middleIndex + 1;
			} else
				return middleIndex;
			if (firstIndex > lastIndex)
				return -1;
		}
	}
}
