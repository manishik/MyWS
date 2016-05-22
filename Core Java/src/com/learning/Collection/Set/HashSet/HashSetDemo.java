package com.learning.Collection.Set.HashSet;

import java.util.ArrayList;
import java.util.Collections;
import java.util.HashSet;
import java.util.Iterator;
import java.util.List;
import java.util.Set;
import java.util.TreeSet;

class HashSetDemo {
	public static void main(String args[]) {

		List<String> list = new ArrayList<String>();
		list.add("A");
		list.add("B");
		list.add("C");
		
		//Adding duplicates
		list.add("A");
		list.add("B");
		list.add("C");
		
		System.out.println("ArrayList = "+list);
		Collections.sort(list); //Sorting a list
		System.out.println("Sorted ArrayList = "+list);
		
		Set<String> hashSet = new HashSet<String>();
		
		HashSet<List<?>> hashSetOfList = new HashSet<List<?>>();
		
		hashSet.add("C");
		hashSet.add("D");
		hashSet.add("E");
		hashSet.add("A");
		hashSet.add("B");
		hashSet.add("F");
		
		//Adding duplicates
		hashSet.add("A");
		hashSet.add("B");
		hashSet.add("C");
		hashSet.add("D");
		hashSet.add("E");
		
		List<Integer> list1 = new ArrayList<Integer>();
		list1.add(90);list1.add(1);list1.add(45);list1.add(60);list1.add(60);list1.add(90);
		
		hashSetOfList.add(list); //Adding a list to HashSet
		hashSetOfList.add(list1); //Adding one more list.
		System.out.println("hashSetOfList = "+hashSetOfList); 
		
		hashSet.add("Manish the 'JAVA GURU' of HCL");
		hashSet.add("Manish the 'JAVA GURU' of HCL"); //Adding duplicate
		
		System.out.println("HashSet = "+hashSet); //No Duplicates
	
		hashSet = new TreeSet<String>(hashSet); //Sorting a HashSet
		
		System.out.println("Sorted HashSet = "+hashSet);
		
		Iterator<String> i1 = hashSet.iterator();
		System.out.print("HashSet elements =");
		while(i1.hasNext()){
			String s = (String)i1.next();
			System.out.print(" "+s);
		}
	}
}