package com.javaInterview.sort_search;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class SelectionSort {

	public static void main(String[] args) throws IOException {
		int array[], i, arraySize, min, pos = 1;

		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

		System.out.println("Enter the Maximum limit of the Array\n");
		arraySize = Integer.parseInt(br.readLine());
		array = new int[arraySize];

		System.out.println("Enter the Elements\n");
		for (i = 0; i < arraySize; i++)
			array[i] = Integer.parseInt(br.readLine());

		System.out.println("Given Elements\n");
		for (i = 0; i < arraySize; i++)
			System.out.println(" " + array[i]);

		min = array[0];
		for (i = 1; i < arraySize; i++)
			if (array[i] < min) {
				min = array[i];
				pos = i + 1;
			}

		System.out.println("\nThe Minimum Element " + min + " is at the Position " + pos);

		selectionSort(array, arraySize);

		System.out.println("\nElements in Sorted Order\n");
		for (i = 0; i < arraySize; i++)
			System.out.println(" " + array[i]);
	}

	static void selectionSort(int array[], int arraySize) {
		int i, j, temp;
		for (i = 0; i < arraySize; i++)
			for (j = i + 1; j < arraySize; j++)
				if (array[i] > array[j]) {
					temp = array[i];
					array[i] = array[j];
					array[j] = temp;
				}
	}

}
