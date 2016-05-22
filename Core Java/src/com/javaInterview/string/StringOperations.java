package com.javaInterview.string;

import java.util.ArrayList;
import java.util.List;

public class StringOperations {

	public static void main(String[] args) {

		String str = "   This is a test String and to check all its related opearions  ";

		System.out.println("String with toString = " + str.toString());
		System.out.println("String with toLowerCase = " + str.toLowerCase());
		System.out.println("String with toUpperCase = " + str.toUpperCase());
		System.out.println("String with trim = " + str.trim());

		String[] strArray = str.split(" ");
		List<String> list = new ArrayList<String>();

		for (int i = 0; i < strArray.length; i++) {
			list.add(strArray[i]);
		}

		System.out.println("ArrayList = " + list);

	}

}
