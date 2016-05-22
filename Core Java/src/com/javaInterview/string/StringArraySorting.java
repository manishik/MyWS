package com.javaInterview.string;

import java.util.Arrays;

public class StringArraySorting {
	public static void main(String[] args) {
		String[] strArray = new String[] { "C", "d", "e", "a", "c", "g", "2", "30", "10", "13", "A", "Z", "M" };
		System.out.println("Before sorting: " + Arrays.asList(strArray));
		Arrays.sort(strArray);
		System.out.println("After sorting: " + Arrays.asList(strArray));
	}
}