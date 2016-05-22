package com.javaInterview.collections.sets;

import java.util.Collections;
import java.util.HashSet;
import java.util.Set;

public class FinalSet {

	public static void main(String[] args) {

		Set<String> hashSet = new HashSet<String>();
		hashSet.add("Manish");
		hashSet.add("Indudhar");
		hashSet.add("Keshav");
		hashSet.add("Manish"); //adding duplicate

		System.out.println("HashSet = "+hashSet);
		
		Set<String> unModiSet = Collections.unmodifiableSet(hashSet);
		
		System.out.println("Unmodifiable Set = "+unModiSet);
		
		//unModiSet.add("Mysore"); //Can't do
	}

}
