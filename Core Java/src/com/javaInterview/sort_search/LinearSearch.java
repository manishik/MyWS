package com.javaInterview.sort_search;

public class LinearSearch {

	public static void main(String[] args) {
		String[] anArrayOfStrings = new String[] { "This", "is", "Manish", "to", "Check" };
		String wordToBeSearched = "ManisH";
		boolean found = false;
		int position = 0;

		for (int i = 0; i < anArrayOfStrings.length; i++) {
			if (!anArrayOfStrings[i].equalsIgnoreCase(wordToBeSearched)) {
				found = false;
			} else {
				found = true;
				position = i;
				break;
			}
		}
		if (found == true) {
			System.out.println("Word " + wordToBeSearched + " is at " + position + " position in the String Array");
		} else {
			System.out.println("Word not found in String Array");
		}
	}
}
