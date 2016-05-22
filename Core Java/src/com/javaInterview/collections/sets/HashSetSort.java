package com.javaInterview.collections.sets;

import java.util.HashSet;
import java.util.Set;
import java.util.TreeSet;

public class HashSetSort {

	public static void main(String[] args) {

		Set<String> hashSet = new HashSet<String>(); // A HashSet is an unsorted, unordered Set.
		HashSet<String> anotherHashSet = new HashSet<String>(); //Cannot sort this using TreeSet
		hashSet.add("ZAA"); hashSet.add("11"); hashSet.add("SM");
		hashSet.add("AA"); hashSet.add("AA"); hashSet.add("MA"); 
		hashSet.add("NB"); hashSet.add("11"); hashSet.add("ZAA");    
		
		System.out.println("HashSet = "+hashSet); //No Duplicates 
		
		hashSet = new TreeSet<String>(hashSet); //Sorting a HashSet (Need to be Polymorphic way of declaring HashSet)    
		
		System.out.println("HashSet after Sorting= "+hashSet);
		
	}

}
