package com.javaInterview.sort_search.comparator;

import java.util.Comparator;

public class NameSort implements Comparator<Family> {

	public int compare(Family family, Family family2) {

		String familyName1 = family.getName();
		String familyName2 = family2.getName();

		// compare can internally use compareTo method
		// Ascending Order
		// return familyName1.compareTo(familyName2);

		// Descending Order
		return familyName2.compareTo(familyName1);
	}

}
