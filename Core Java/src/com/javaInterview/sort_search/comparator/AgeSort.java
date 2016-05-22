package com.javaInterview.sort_search.comparator;

import java.util.Comparator;

public class AgeSort implements Comparator<Family> {

	public int compare(Family family, Family family2) {

		int age1 = family.getAge();
		int age2 = family2.getAge();

		// return age1 - age2; // Ascending order
		return age2 - age1; //Descending order

	}

}
