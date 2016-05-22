package com.javaInterview;

public class Solution {

	public static void main(String[] args) {
		int[] array = new int[] { 1, 2, 3, 4, 5, 6, 7, 8, 9 };
		boolean b = swapped(array);
		System.out.println(b);
	}

	static boolean swapped(int arr[]) {
		boolean swapped = false;
		int i, temp;
		for (i = (arr.length) - 1; i > 0 && swapped == false; i--) {
			if (arr[i] < arr[i - 1]) {
				int j = i - 1;
				while (j >= 0 && arr[i] < arr[j])
					j--;
				temp = arr[i];
				arr[i] = arr[j + 1];
				arr[j + 1] = temp;
				swapped = true;
			}
		}
		if (swapped && (i == 1)) {
			return true;
		} else {
			return false;
		}

	}

}
