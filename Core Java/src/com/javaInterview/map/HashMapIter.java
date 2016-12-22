package com.javaInterview.map;

import java.util.HashMap;
import java.util.Iterator;
import java.util.Map;
import java.util.Set;

public class HashMapIter {

	public static void main(String[] args) {
		Map<String, String> hashMap = new HashMap<String, String>();
		hashMap.put("6", "Six");
		hashMap.put("6", "Six");
		hashMap.put(null, "null");
		hashMap.put("Hey", "Four");
		hashMap.put("AB", "Four");
		hashMap.put("Manish", "Eleven");
		hashMap.put("Zany", "Four");
		hashMap.put("Nandini", "TwentyNine");
		hashMap.put(null, "Manish");

		System.out.println("HashMap = " + hashMap);
		String val = "";
		for (Map.Entry<String, String> map : hashMap.entrySet()) {
			System.out.println("Key: " + map.getKey() + " Value: " + map.getValue());

			if (map.getKey() == "AB") {
				val = map.getValue();
			}
		}

		System.out.println();

		// Get Only the Keys
		Set set = hashMap.keySet();
		System.out.println("Keys = " + set);

		System.out.println();

		for (String key : hashMap.keySet()) {
			System.out.println("Key: " + key + ", Value: " + hashMap.get(key));
		}
		
		System.out.println();
		
		//iterating over values only
		for (String value : hashMap.values()) {
		    System.out.println("Value = " + value);
		}

		System.out.println();

		String str = hashMap.get("Manish");
		//System.out.println("Manish = " + str);

		// Without Generics
		Iterator entries1 = hashMap.entrySet().iterator();
		while (entries1.hasNext()) {
			Map.Entry entry = (Map.Entry) entries1.next();
			String key = (String) entry.getKey();
			String value = (String) entry.getValue();
			System.out.println("Key = " + key + ", Value = " + value);
		}

		System.out.println();
		
		// Using Generics
		Map<Integer, Integer> map = new HashMap<Integer, Integer>();
		map.put(10, 10);map.put(10, 10);map.put(10, 11); map.put(1, 10);
		Iterator<Map.Entry<Integer, Integer>> entries = map.entrySet().iterator();
		while (entries.hasNext()) {
			Map.Entry<Integer, Integer> entry = entries.next();
			System.out.println("Int Key = " + entry.getKey() + ", Value = " + entry.getValue());
		}

	}

}
