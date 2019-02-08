package com.java8;

import java.util.ArrayList;
import java.util.HashMap;

public class Test {

	public static void main(String[] args) {
		MyFuncInterface fobj = (int ii) -> System.out.println(2 * ii);

		// This calls above lambda expression and prints 10.
		fobj.abstractFun(10);

		System.out.println();

		HashMap<String, String> hashMap = new HashMap<String, String>();
		hashMap.put("Hey", "1");
		hashMap.put("Hey", "Manish");
		hashMap.put("1", "Keshav");

		hashMap.forEach((k, v) -> System.out.println(k + " " + v));

		System.out.println();

		ArrayList<Integer> arrayList = new ArrayList<Integer>();
		arrayList.add(1);
		arrayList.add(2);
		arrayList.add(3);
		arrayList.add(4);

		// Using lambda expression to print all elements
		// of arrL
		arrayList.forEach(someIterator -> System.out.print(someIterator + " "));

		System.out.println();

		// Using lambda expression to print even elements of arrayList
		arrayList.forEach(someIterator1 -> {
			if (someIterator1 % 2 == 0)
				System.out.print(someIterator1 + " ");
		});

		System.out.println();

		// Using lambda expression to print odd elements of arrayList
		arrayList.forEach(someIterator -> {
			if (someIterator % 2 != 0)
				System.out.print(someIterator + " ");
		});

	}

}

@FunctionalInterface
interface MyFuncInterface {
	// An abstract function
	void abstractFun(int x);

	// A non-abstract (or default) function
	default void normalFun() {
		System.out.println("Hello");
	}
}

/*
 * {
 * 
 * lambda: operator -> body
 * 
 * where lambda operator can be: () ->
 * System.out.println("Zero parameter lambda"); (p) ->
 * System.out.println("One parameter: " + p); (p1, p2) ->
 * System.out.println("Multiple parameters: " + p1 + ", " + p2);
 * 
 * }
 */
