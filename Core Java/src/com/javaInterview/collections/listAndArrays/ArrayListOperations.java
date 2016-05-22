package com.javaInterview.collections.listAndArrays;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.List;

public class ArrayListOperations {

	public static void main(String[] args) {
		String[] coins = { "Z", "B", "C", "G", "E" };

		//Converting Array to List (Classic way)
		List<String> list = new ArrayList<String>();
		for (int i = 0; i < coins.length; i++){
			list.add(coins[i]);
		}
		System.out.println("List = "+list);
		
		list.add("F"); //adds the element to the end of list
		list.add(2, "B2"); //adds to the specified position 
		System.out.println("List after adding = "+list);
		
		//Converting Array to List using functions
		List<String> list2 = new ArrayList<String>();
		list2 = Arrays.asList(coins);
		System.out.println("List 2 = "+list2);
		//Unable to add after conversion (using Arrays.asList)
		//list2.add(1, "Z2"); //adds to the specified position
		//System.out.println("List 2 after adding = "+list2);
		
		//Reversing the list using functions
		Collections.reverse(list);
		System.out.println("List after Reversing = "+list);
		
		//Reversion the list without using functions
		List revList = new ArrayList();
		for (int i = list2.size() - 1; i >= 0; i--) {
			Object obj = list2.get(i);
			revList.add(obj);
		}
		System.out.println("Reversed List = "+revList);
		
		//Converting List to Array using functions
		//Object[] o1 = list.toArray(l1);
	}

}
