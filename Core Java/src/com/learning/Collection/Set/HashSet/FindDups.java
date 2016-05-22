package com.learning.Collection.Set.HashSet;

import java.util.HashSet;
import java.util.Set;

public class FindDups {
	public static void main(String[] args) {
		Set<String> set = new HashSet<String>();
		for (String str : args)
			if (!set.add(str))
				System.out.println("Duplicate detected: " + str);
		System.out.println(set.size() + " distinct words: " + set);
	}
}
