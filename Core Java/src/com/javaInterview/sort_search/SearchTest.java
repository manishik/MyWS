package com.javaInterview.sort_search;

import java.util.*;

public class SearchTest {
	public static void main(String args[]) {
		String simpsons[] = { "Bart", "Hugo", "Lisa", "Marge", "Homer",
				"Maggie", "Roy" };

		// Convert to list
		ArrayList list = new ArrayList(Arrays.asList(simpsons));

		// Ensure list sorted
		Collections.sort(list);
		System.out.println("Sorted list: [length: " + list.size() + "]");
		System.out.println(list);

		// Search for element in list
		int index = Collections.binarySearch(list, "Maggie");
		System.out.println("Found Maggie @ " + index);

		// Search for element not in list
		index = Collections.binarySearch(list, "Jimbo Jones");
		System.out.println("Didn't find Jimbo Jones @ " + index);

		// Insert
		int newIndex = -index - 1;
		list.add(newIndex, "Jimbo Jones");
		System.out.println("With Jimbo Jones added: [length: " + list.size()
				+ "]");
		System.out.println(list);
	}
}
