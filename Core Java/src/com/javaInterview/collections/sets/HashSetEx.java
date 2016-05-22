package com.javaInterview.collections.sets;

import java.util.ArrayList;
import java.util.HashSet;
import java.util.List;

public class HashSetEx {

	public static void main(String[] args) {

		List list = new ArrayList();
		list.add("hey"); list.add("hey"); list.add("Manish"); list.add(1); list.add(1); list.add(2);
		System.out.println("List 1 = " + list);

		List list2 = new ArrayList();
		list2.add("hey"); list2.add("hey"); list2.add("Manish"); list2.add(1); list2.add(1); list2.add(2);
		System.out.println("List 2 = " + list2);
		
		List list3 = new ArrayList();
		list3.add("hey"); list3.add(2); list3.add(1); list3.add("Manish"); list3.add(null);
		System.out.println("List 3 = " + list3);

		HashSet<List> hashSet = new HashSet<List>();
		
		System.out.println("HashSet before adding = " + hashSet);
		hashSet.add(list);
		hashSet.add(list2); // Can't add a duplicate list having the same elements
		hashSet.add(list3); // Adding a different list
		System.out.println("HashSet after adding = " + hashSet);
		System.out.println("HashSet size = " + hashSet.size());
		System.out.println("HashSet contains list2 ??? = " + hashSet.contains(list2));
		System.out.println("Is HashSet Empty = " + hashSet.isEmpty());
		System.out.println("HashSet remove list = " + hashSet.remove(list));
		System.out.println("HashSet after removing = " + hashSet);
		System.out.println("HashSet size = " + hashSet.size());
	}

}
