package com.learning.II_Sem;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class QuickSort {

	public static void main(String[] args) throws IOException {
		int array[], i, arraySize;
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

		System.out.println("Enter the Size of the Array : ");
		arraySize = Integer.parseInt(br.readLine());
		array = new int[arraySize];
		System.out.println("\nEnter the Elements of the Array \n");
		for (i = 0; i < arraySize; i++)
			array[i] = Integer.parseInt(br.readLine());
		System.out.println("Given Elements of the Array \n");
		for (i = 0; i < arraySize; i++)
			System.out.println(" " + array[i]);
		quicksort(array, 0, arraySize - 1);
		System.out.println("\nSorted (Ascending Order) Array is\n");
		for (i = 0; i < arraySize; i++)
			System.out.println(" " + array[i]);
	}

	static int quicksort(int a[], int low, int high) {
		int i;
		if (low < high) {
			i = partition(a, low, high);
			quicksort(a, low, i - 1);
			quicksort(a, i + 1, high);
		}
		return 0;
	}

	static int partition(int a[], int low, int high) {
		int i, j, temp, key;
		i = low + 1;
		key = a[low];
		j = high;
		while (true) {
			while (i < high && key >= a[i])
				i++;
			while (key < a[j])
				j--;
			if (i < j) {
				temp = a[i];
				a[i] = a[j];
				a[j] = temp;
			} else {
				temp = a[low];
				a[low] = a[j];
				a[j] = temp;
				return (j);
			}
		}
	}

}
