package com.javaInterview.basics;

import java.util.ArrayList;

public class Division {

	public static void main(String[] args) {
		int number = 1234658790;
		int sumTotal = 0;

		// Converting int number to ArrayList
		ArrayList<Integer> arrayList = new ArrayList<Integer>();
		do {
			System.out.println("Remainder = " + number % 10);
			arrayList.add(number % 10); // % gets the remainder
			sumTotal = sumTotal + (number % 10);
			number = number / 10; // / gets the quotient
			System.out.println("Quotient = " + number);
		} while (number > 0);

		// System.out.println("arrayList total = " + sumTotal);
		// System.out.println("arrayList = " + arrayList);

		// Collections.reverse(arrayList); //Same reversing below

		ArrayList<Integer> revList = new ArrayList<Integer>();
		for (int i = arrayList.size() - 1; i >= 0; i--) {
			revList.add(arrayList.get(i));
		}

		System.out.println("Reverse arrayList = " + revList);

		// converting ArrayList to int array
		int[] ints = new int[revList.size()];
		int i = 0;
		for (Integer in : revList) {
			ints[i++] = in;
		}

		for (Integer j : ints) {
			System.out.println("Nums = " + j);
		}

	}

}
