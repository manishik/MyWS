package com.learning.arrays;

import java.util.Arrays;
import java.util.Collections;
import java.util.HashSet;
import java.util.List;
import java.util.Set;
import java.util.stream.Collectors;

public class Dups {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		List<Integer> numbers = Arrays.asList(new Integer[] { 1, 2, 1, 3, 4, 4 });

		numbers.stream().filter(i -> Collections.frequency(numbers, i) > 1).collect(Collectors.toSet())
				.forEach(System.out::println);

		
		someMethod();
	}

	static void someMethod() {
		Integer[] numbers = new Integer[] { 1, 2, 1, 3, 4, 4 };
		Set<Integer> allSetIntItems = new HashSet<>();
		Set<Integer> duplicates = Arrays.stream(numbers).filter(n -> !allSetIntItems.add(n)) // Set.add() returns false if the
																						// item was already in the set.
				.collect(Collectors.toSet());
		System.out.println(duplicates); // [1, 4]

	}

}
