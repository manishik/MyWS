package com.learning.Collection.Set.HashSet;

import java.util.HashSet;
import java.util.Set;

public class FindDups2 {
	public static void main(String[] args) {
		Set<String> uniques = new HashSet<String>();
		Set<String> dups = new HashSet<String>();

		for (String str : args)
			if (!uniques.add(str))
				dups.add(str);

		uniques.removeAll(dups);

		System.out.println("Unique words:    " + uniques);
		System.out.println("Duplicate words: " + dups);
	}
}
