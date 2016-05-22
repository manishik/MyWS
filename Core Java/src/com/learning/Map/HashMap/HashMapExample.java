package com.learning.Map.HashMap;

import java.util.HashMap;
import java.util.Iterator;
import java.util.Map;
import java.util.Set;
import java.util.TreeMap;

public class HashMapExample {
	public static void main(String[] args) {
		Map<Integer, String> hashMap = new HashMap<Integer, String>();

		hashMap.put(7, "Seven");
		hashMap.put(new Integer(3), "Three");
		hashMap.put(new Integer(2), "Two");
		hashMap.put(6, "Six");
		hashMap.put(new Integer(4), "Four");
		hashMap.put(new Integer(1), "One");
		hashMap.put(new Integer(5), "Five");
		
		System.out.println("HashMap = "+hashMap);
		
		Map<Integer, String> treeMap = new TreeMap<Integer, String>(hashMap);
		
		System.out.println("Tree Map = "+treeMap);

		System.out.println("Map Values Before: ");
		Set keys = treeMap.keySet();
		for (Iterator iterator = keys.iterator(); iterator.hasNext();) {
			Integer key = (Integer) iterator.next();
			String value = (String) treeMap.get(key);
			System.out.println(key + " = " + value);
		}

		System.out.println("\nRemove element with key 6");
		hashMap.remove(new Integer(6));
		System.out.println("Does map contains value 'three' = "+hashMap.containsValue("Three"));
		
		System.out.println("\nMap Values After: ");
		for (Iterator iterator = keys.iterator(); iterator.hasNext();) {
			Integer key = (Integer) iterator.next();
			String value = (String) hashMap.get(key);
			System.out.println(key + " = " + value);
		}
	}
}
