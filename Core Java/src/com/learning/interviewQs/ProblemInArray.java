package com.learning.interviewQs;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.HashSet;
import java.util.Set;

public class ProblemInArray {

	public static void main(String[] args) {

		int[] numbers = { 2, 4, 3, 5, 7, 8, 9 };
		int[] numbersWithDuplicates = { 2, 4, 3, 5, 6, -2, 4, 7, 8, 9 };
		prettyPrint(numbers, 10);
		// prettyPrint(numbersWithDuplicates, 7);

		//number to array of integers
		/*int number = 384759837;
		ArrayList<Integer> arrayList = new ArrayList<Integer>();
		do {
			arrayList.add(number % 10);
			number = number / 10;
		} while (number > 0);

		Collections.reverse(arrayList);
		System.out.println("arrayList = " + arrayList);*/

	}

	public static void prettyPrint(int[] givenArray, int givenSum) {
		System.out.println("Given array : " + Arrays.toString(givenArray));
		System.out.println("Given sum : " + givenSum);
		System.out.println("Integer numbers, whose sum is equal to value : " + givenSum);
		//printPairs(givenArray, givenSum);
		printPairsUsingSet(givenArray, givenSum);
	}

	//First Way of doing 
	public static void printPairs(int[] array, int sum) {
		for (int i = 0; i < array.length; i++) {
			int first = array[i];
			for (int j = i + 1; j < array.length; j++) {
				int second = array[j];
				if ((first + second) == sum) {
					// System.out.printf("(%d, %d) %n", first, second);
					System.out.println("(" + first + "," + second + ")" + "@ " + i + "," + j);
				}
			}
		}
	}

	//Second Way of doing 
	public static void printPairsUsingSet(int[] numbers, int n) {
		if (numbers.length < 2) {
			return;
		}
		Set set = new HashSet(numbers.length);
		for (int value : numbers) {
			int target = n - value;
			// if target number is not in set then add
			if (!set.contains(target)) {
				set.add(value);
			} else {
				System.out.printf("(%d, %d) %n", value, target);
			}
		}
	}

}
