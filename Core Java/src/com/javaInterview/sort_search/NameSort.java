package com.javaInterview.sort_search;

import java.util.Arrays;
import java.util.Collections;
import java.util.List;

public class NameSort {
	public static void main(String args[]) {
		String strArray[] = new String[] { "John", "Lennon", "Karl", "Marx",
				"Groucho", "Marx", "Oscar", "Grouch" };

		for (String string : strArray) {
			System.out.print(string + " ");
		}
		System.out.println();
		
		Arrays.sort(strArray);
		
		for (String string : strArray) {
			System.out.print(string + " ");
		}
		
		System.out.println();
		List<String> list = Arrays.asList(strArray); //converting string array to list of string 
		
		Collections.sort(list);
		System.out.println("Sorted List = " + list); //sorted list of strings

		String[] stringArray = (String[]) list.toArray(); //converting list of string to array of strings 
		System.out.print("List = ");
		System.out.print("[");
		for (String string : stringArray) {
			System.out.print(string + " ");
		}
		System.out.print("]");
		
	}
}
