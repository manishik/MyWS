package com.javaInterview;

import java.util.HashMap;

public class Anagram {

	public static void main(String[] args) {

		String str1 = "Manish is a jack ass";
		String str2 = "Manish is a ";
		
		//Form the hashmap for 1st str
		
		String emptyStr = "";
		int length = str1.length();
		HashMap hashMap = new HashMap<>();
		while (length != 0) {
			int count = 0;
			String ch = str1.substring(0, 1);
			for (int i = 0; i < length; i++) {
				String t = str1.substring(i, i + 1);
				if ((t.equalsIgnoreCase(ch))) {
					count++;
				} else {
					emptyStr = emptyStr + str1.substring(i, i + 1);
				}
			}
			//System.out.println("The character " + ch + " appears " + count + " time(s)");
			hashMap.put(ch, count);
			str1 = emptyStr;
			length = str1.length();
			emptyStr = "";
		}
		System.out.println(hashMap);
		
		int length2 = str2.length();
		
	}

}
