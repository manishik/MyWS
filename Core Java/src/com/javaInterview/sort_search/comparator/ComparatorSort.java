package com.javaInterview.sort_search.comparator;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.Comparator;
import java.util.List;

public class ComparatorSort {

	// using List
	List<Family> familyList = new ArrayList<Family>();

	// using Arrays
	Family[] family = new Family[3];

	public static void main(String[] args) {
		new ComparatorSort().go();
	}

	public void go() {

		/*
		 * familyList.add(new Family("Nandini", 26)); familyList.add(new
		 * Family("Samarth", 1)); familyList.add(new Family("Manish", 32));
		 */

		// Date modified 28th March 2016
		// sorting family but family need not implement Comparator
		familyList.add(new Family("Nandini", 29));
		familyList.add(new Family("Samarth", 3));
		familyList.add(new Family("Manish", 35));

		family[0] = new Family("Nandini", 29);
		family[1] = new Family("Samarth", 3);
		family[2] = new Family("Manish", 35);

		System.out.println("Family Name List = " + familyList);
		// Collections sorting
		// Using a different classes
		// Collections.sort(familyList, new NameSort());
		// Collections.sort(familyList, new AgeSort());

		// Sort by FamilyName directly 
		Collections.sort(familyList, new Comparator<Family>() {
			public int compare(Family family, Family family2) {
				return family.getName().compareTo(family2.getName());
			}
		});

		System.out.println("Sorted Family's List = " + familyList);

		// Display array 
		System.out.println("Family Names = ");
		for (int i = 0; i < family.length; i++) {
			System.out.println(family[i].getName() + " " + family[i].getAge());
		}

		// Arrays sorting
		// Arrays.sort(family, new NameSort());
		Arrays.sort(family, new AgeSort());

		System.out.println("Family after sorting = ");
		for (int i = 0; i < family.length; i++) {
			System.out.println(family[i].getName() + " " + family[i].getAge());
		}

	}

}
