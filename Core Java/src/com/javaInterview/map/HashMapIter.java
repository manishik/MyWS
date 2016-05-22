package com.javaInterview.map;

import java.util.HashMap;
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
		
		System.out.println("HashMap = "+hashMap);
		String val = "";
		for (Map.Entry<String, String> map : hashMap.entrySet()) {
			System.out.println("Key: " + map.getKey() + " Value: " + map.getValue());
			
			if(map.getKey() == "AB"){
				val = map.getValue();
			}
		}
		
		System.out.println();
		
		//Get Only the Keys
		Set set = hashMap.keySet();
		System.out.println("Keys = "+set);
		
		System.out.println();
		
		for (String key : hashMap.keySet()) {
		    System.out.println("Key: " + key + ", Value: " + hashMap.get(key));
		}
		
		System.out.println();
		
		String str = hashMap.get("Manish");
		System.out.println("Manish = "+str);
	}

}
