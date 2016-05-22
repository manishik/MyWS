package com.javaInterview.map;

import java.util.HashMap;

public class HashMapExam {

	public static void main(String[] args) {

		HashMap<String, String> hashMap = new HashMap<String, String>();
		hashMap.put("6", "Six");
		hashMap.put("6", "Six");
		hashMap.put(null, "null");
		hashMap.put("Hey", "Four");
		hashMap.put("AB", "Four");
		hashMap.put("Manish", "Eleven");
		hashMap.put("Zany", "Four");
		hashMap.put("Nandini", "TwentyNine");
		hashMap.put(null, "null");
		System.out.println("HashMap = " + hashMap);

		HashMap hashMap2 = new HashMap();
		hashMap2.put("6", "Six");
		hashMap2.put("6", "Six");
		hashMap2.put(null, null);
		hashMap2.put("Hey", "Four");
		hashMap2.put("Manish", null);
		hashMap2.put("Hey", null);
		hashMap2.put(null, "Idiot");
		System.out.println("HashMap2 = " + hashMap2);

		HashMap<Integer, String> hm = new HashMap<Integer, String>();
		hm.put(1, "Manish");
		hm.put(1, "Indudhar");
		hm.put(new Integer(1), "Keshav");
		System.out.println("HashMap = " + hm);
	}

}
