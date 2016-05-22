package com.javaInterview.string;

import java.util.Hashtable;

public class StringProb {

	public static void main(String[] args) {
		Hashtable result = check("MaMn!ismhM0011336M", "In ' dud..haM3r");

	}

	public static Hashtable check(String string1, String string2) {

		String s1 = clearJunk(string1);
		String s2 = clearJunk(string2);

		System.out.println("S1 = " + s1);
		System.out.println("S2 = " + s2);

		String temp = s1;

		if (s1.length() < s2.length()) {
			temp = s2;
		}

		Hashtable hashtable = toHash(temp);
		System.out.println("hashtable = " + hashtable);
		return hashtable;
	}

	public static Hashtable toHash(String input) {
		Hashtable hashtable = new Hashtable();
		for (int i = 0; i < input.length(); i++) {
			int value = 1;
			if (hashtable.containsKey(input.charAt(i))) {
				value = (int) hashtable.get(input.charAt(i));
				value++;
			}
			hashtable.put(input.charAt(i), value);
		}
		return hashtable;
	}

	public static String clearJunk(String string) {
		int i, len = string.length();
		StringBuffer dest = new StringBuffer(len);
		char c;

		for (i = 0; i <= len - 1; i++) { // Reverse Iteration
			c = string.charAt(i);
			if (Character.isLetter(c)) {
				dest.append(c);
			}
		}
		return dest.toString();
	}
}
