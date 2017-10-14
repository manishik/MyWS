package com.javaInterview.map;

import java.util.Hashtable;

public class HashtableEx {

	public static void main(String[] args) {

		Hashtable hashtable = new Hashtable();
		hashtable.put("6", "Six");
		hashtable.put("6", "Six");
		// hashtable.put(null, "null"); // Cannot add null key (Runtime NullPointerException)
		// hashtable.put("Key", null); // Cannot add null value also (Runtime NullPointerException)
		hashtable.put("Hey", "Four");
		hashtable.put("AB", "Four");
		hashtable.put("Manish", "Indudhar");
		hashtable.put("Key", "Value");
		hashtable.put("Key", "Value Changed");
		hashtable.put("AC", "DC");

		System.out.println("Hashtable = " + hashtable);

		// Can get value using key directly without iterating the hashtable
		System.out.println("Value of key 'Manish' = "+hashtable.get("Manish"));
	}

}
