package com.learning.II_Sem;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class InsertionSort {

	public static void main(String[] args) throws IOException {

		int array[], i, j, arraySize, key = 0;
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		System.out.println("Enter the Size of the Array : ");
		arraySize = Integer.parseInt(br.readLine());
		array = new int[arraySize];
		System.out.println("Enter the Elements of the Array : ");
		for (i = 0; i < arraySize; i++)
			array[i] = Integer.parseInt(br.readLine());
		for (i = 1; i < arraySize; i++) {
			key = array[i];
			for (j = i - 1; j >= 0 && key < array[j]; j--)
				array[j + 1] = array[j];
			array[j + 1] = key;
		}
		System.out.println("Sorted(Ascending) Array is\n");
		for (i = 0; i < arraySize; i++)
			System.out.println(" " + array[i]);
	}

}
