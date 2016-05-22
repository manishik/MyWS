package com.javaInterview.collections.sets;

import java.util.Collections;
import java.util.TreeSet;

class TreeSetEx {
	public static void main(String[] args) {
		String[] coins = { "Penny", "nickel", "dime", "Quarter", "dollar", "Rupee", "paise" };

		TreeSet treeSet = new TreeSet();
		for (int i = 0; i < coins.length; i++)
			treeSet.add(coins[i]);

		System.out.println("TreeSet = "+treeSet);
		
		System.out.println(Collections.min(treeSet));
		System.out.println(Collections.min(treeSet, String.CASE_INSENSITIVE_ORDER));
		System.out.println(Collections.max(treeSet));
		System.out.println(Collections.max(treeSet, String.CASE_INSENSITIVE_ORDER));
		
		TreeSet treeSet2 = new TreeSet();
		treeSet2.add("Samarth");
		treeSet2.add("Manish");
		treeSet2.add("Nandini");
		treeSet2.add("13");
		treeSet2.add("11");
		treeSet2.add("29");
		System.out.println("TreeSet = "+treeSet2); // Sorted Set 
		
	}
}
