package com.javaInterview.collections.sets;

import java.util.Iterator;
import java.util.LinkedHashSet;
import java.util.Set;
import java.util.TreeSet;

public class LinkedHashSetExample {
	public static void main(String[] args) {
		
		LinkedHashSet<Integer> linkedHashSet = new LinkedHashSet<Integer>(); // A LinkedHashSet is an ordered version of HashSet

		linkedHashSet.add(new Integer(5));
		linkedHashSet.add(new Integer(6));
		linkedHashSet.add(new Integer(7));
		linkedHashSet.add(new Integer(8));
		linkedHashSet.add(new Integer(9));
		linkedHashSet.add(new Integer(1));
		linkedHashSet.add(new Integer(2));
		linkedHashSet.add(new Integer(3));
		linkedHashSet.add(new Integer(4));
		linkedHashSet.add(new Integer(10));
		linkedHashSet.add(new Integer(0));
		linkedHashSet.add(new Integer(-2));
		//Adding duplicates
		linkedHashSet.add(new Integer(9));
		linkedHashSet.add(new Integer(1));
		linkedHashSet.add(new Integer(6));
		
		
		System.out.println("LinkHashSet = "+linkedHashSet); // Maintains insertion order 
		
		// Use iterator to display the LinkedHashset
		System.out.println("LinkedHashSet : ");
		for (Iterator iterator = linkedHashSet.iterator(); iterator.hasNext();) {
			Integer integer = (Integer) iterator.next();
			System.out.print(" "+integer);
		}
		
		System.out.println();
		//To sort the LinkedHashSet
		Set<Integer> sortLHS = new TreeSet<Integer>(linkedHashSet);
		System.out.println("Sorted LinkedHashSet = "+sortLHS);
		
		sortLHS.remove(5);
		
		System.out.println("Sorted LinkedHashSet after removing 5 = "+sortLHS);
	}
}
