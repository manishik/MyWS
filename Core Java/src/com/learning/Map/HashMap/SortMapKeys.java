package com.learning.Map.HashMap;

import java.util.HashMap;
import java.util.LinkedHashMap;
import java.util.Map;
import java.util.Set;
import java.util.TreeSet;

public class SortMapKeys {

	public static void main(String[] args) {
		HashMap hashMap = new HashMap();
		hashMap.put("key45", "some value");
		hashMap.put("key12", "some other value");
		hashMap.put("key99", "value");
		hashMap.put("key55", "another value");
		hashMap.put("key39", "yet another value");
		System.out.println("Hashmap = " + hashMap);
		Set keysSet = hashMap.keySet();
		System.out.println("Keys = " + keysSet);
		keysSet = new TreeSet(keysSet); // Sorts the Keys
		System.out.println("Sorted Keys = " + keysSet);

		Map linkedHashMap = new LinkedHashMap();
		linkedHashMap.putAll(hashMap);
		System.out.println("Linked Hash Map = " + linkedHashMap);
	}

}
