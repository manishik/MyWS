package com.javaInterview.arrays;

/* Manish K Indudhar */

public class P1 {

	public static void main(String[] args) {
		int array[] = new int[] { 1, 5, -3, 11, 2, 6, 1, 10 };
		int num = 6;
		int gtCount = 0, ltCount = 0;

		for (int a : array) {
			if (a < num) {
				ltCount++;
			}
			if (a > num) {
				gtCount++;
			}
		}
		System.out.println("The integers in array > " + num + " is " + gtCount + " and < than " + num + " is " + ltCount);
	}

}
