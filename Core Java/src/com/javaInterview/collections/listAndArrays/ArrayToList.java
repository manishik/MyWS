package com.javaInterview.collections.listAndArrays;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.List;

public class ArrayToList {

	public static void main(String args[]) {

		String[] strArray = new String[] { "Java", "Source", "And", "and",
				"Support", "java2s" };

		// Converting Array to List without using default functions
		List<String> list1 = new ArrayList<String>();
		for (int z = 0; z < strArray.length; z++)
			list1.add(strArray[z]);
		System.out.println(list1);

		// Converting Array to List using default functions
		int i;
		List<String> list = Arrays.asList(strArray);

		for (i = 0; i < list.size(); i++) {
			String s1 = (String) list.get(i);
			System.out.print(s1 + " ");
		}
		System.out.println();
		Collections.sort(list);
		System.out.println(list);

		Integer[] i1 = new Integer[] { 1, 2, 3, 9, 9, 8, 7 };
		List<Integer> list2 = Arrays.asList(i1);
		for (int j = 0; j < list2.size(); j++) {
			int z = (Integer) list2.get(j);
			System.out.println(z);
		}
		Collections.sort(list2);
		System.out.println(list2);
	}
}
