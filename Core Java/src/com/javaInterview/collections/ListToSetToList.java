package com.javaInterview.collections;

import java.util.ArrayList;
import java.util.LinkedHashSet;
import java.util.List;
import java.util.Set;
import java.util.TreeSet;

public class ListToSetToList {
	public static void main(String[] args) {
		List<String> myArrayList = new ArrayList<String>();
		myArrayList.add("M"); myArrayList.add("11"); myArrayList.add("A");
		myArrayList.add("B"); myArrayList.add("B"); myArrayList.add("2");
		myArrayList.add("11"); myArrayList.add("B"); myArrayList.add("C");
		myArrayList.add("D"); myArrayList.add("D"); myArrayList.add("2");

		System.out.println(myArrayList + " (ArrayList)");

		Set<String> myLinkedHashSet = new LinkedHashSet<String>(myArrayList); // List to Set (LinkedHashSet)
		// LinkedHashSet maintains insertion order
		
		for (Object object : myLinkedHashSet){
			System.out.print(" "+object);
		}
		System.out.print(" (LinkedHashSet)");
		
		System.out.println();
		//Set<String> treeSet = new TreeSet<String>(myLinkedHashSet); // Sorting
		//System.out.println(treeSet + " (Sorted Set)");
		
		
		List<String> anotherList = new ArrayList<String>(myLinkedHashSet); // Set to List (ArrayList) 
		System.out.println(anotherList+ " (ArrayList from Sorted Set)");
		anotherList.add("A");
		System.out.println(anotherList+ " (ArrayList after adding an element)");
	}

}
