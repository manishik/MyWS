package com.javaInterview.string;

import java.util.ArrayList;
import java.util.List;

public class DuplicatesInTwoStrings {

	public static void main(String[] args) {

		String str1 = "Manish";
		String str2 = "Keshav";

		List l1 = new ArrayList<>();

		for (int i = 0; i < str1.length(); i++) {
			for (int j = 0; j < str2.length(); j++) {
				if (str1.charAt(i) == str2.charAt(j)) {
					l1.add(str1.charAt(i));
				}
			}
		}
		System.out.println(l1);
	}
}
