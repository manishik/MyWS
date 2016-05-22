package com.javaInterview.map;

import java.util.HashMap;
import java.util.LinkedHashMap;
import java.util.Map;

public class LinkedHashMapExample {

	public static void main(String[] args) {
		//LinkedHashMap
		Map<Integer, String> linkedHashMap = new LinkedHashMap<Integer, String>();

		linkedHashMap.put(7, "Seven");
		linkedHashMap.put(new Integer(3), "Three");
		linkedHashMap.put(new Integer(2), "Two");
		linkedHashMap.put(new Integer(2), "Two");
		linkedHashMap.put(6, "Six");
		linkedHashMap.put(null, "Manish");
		linkedHashMap.put(new Integer(4), "Four");
		linkedHashMap.put(new Integer(1), "One");
		linkedHashMap.put(new Integer(5), "Five");
		linkedHashMap.put(null, "null");
		
		//maintains insertion order, can't have duplicate keys, allows only one null key
		System.out.println("LinkedHashMap = "+linkedHashMap); 
		
		//HashMap
		Map<Integer, String> hashMap = new HashMap<Integer, String>();

		hashMap.put(7, "Seven");
		hashMap.put(new Integer(3), "Three");
		hashMap.put(new Integer(2), "Two");
		hashMap.put(6, "Six");
		hashMap.put(6, "Six");
		hashMap.put(null, "null");
		hashMap.put(new Integer(4), "Four");
		hashMap.put(new Integer(1), "One");
		hashMap.put(new Integer(5), "Five");
		hashMap.put(null, "null");
		
		System.out.println("HashMap = "+hashMap); // can't have duplicate keys, allows only one null key
		
		System.out.println("HashMap = "+hashMap.get(null));
		System.out.println("HashMap = "+hashMap.get(6)); 
		
		//HashMap
		Map hashMap1 = new HashMap();
		hashMap1.put(null, null);
		hashMap1.put(null, "null 1");
		System.out.println("HashMap 1 = "+hashMap1.get(null));
	}

}
