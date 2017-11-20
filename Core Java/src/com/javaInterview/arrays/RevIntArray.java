package com.javaInterview.arrays;

public class RevIntArray {

	public static void main(String[] args) {
		int a[] = new int[] { 4, -1, -2, 3, 5, 0 };
		
		System.out.println("a[j]");
		for (int i = 0; i < a.length; i++) {
			System.out.print(a[i] + " ");
		}

		int b[] = new int[a.length];

		int j = 0;
		for (int i = a.length - 1; i >= 0; i--) {
			b[j] = a[i];
			j++;
		}
		System.out.println();
		System.out.println("b[j]");

		for (int i = 0; i < b.length; i++) {
			System.out.print(b[i] + " ");
		}
	}

}
