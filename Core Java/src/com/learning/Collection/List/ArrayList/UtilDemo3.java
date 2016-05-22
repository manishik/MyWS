package com.learning.Collection.List.ArrayList;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.List;
import java.util.ListIterator;

class UtilDemo3 {
	public static void main(String[] args) {
		String[] coins = { "A", "B", "C", "D", "E" };

		//Converting Array to List
		List list = new ArrayList();
		for (int i = 0; i < coins.length; i++)
			list.add(coins[i]);
		
		/*List list1 = Arrays.asList(coins);
		System.out.println(list1);*/

		ListIterator liter = list.listIterator();

		System.out.println("ArrayList");
		while (liter.hasNext())
			System.out.print(" "+liter.next());

		System.out.println();
		System.out.println("ArrayList after Reversing");
		Collections.reverse(list);

		liter = list.listIterator();

		while (liter.hasNext())
			System.out.print(" "+liter.next());
	}
}
