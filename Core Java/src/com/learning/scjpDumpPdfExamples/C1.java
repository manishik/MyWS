package com.learning.scjpDumpPdfExamples;

import java.util.Iterator;
import java.util.TreeSet;

class Drink implements Comparable<Drink> {

	public String name;

	/*
	  public int compareTo(Object o) { return 0; }
	 */

	public int compareTo(Drink dd) {
		return name.compareTo(dd.getName());
	}

	public String getName() {
		return name;
	}

}

public class C1 {
	public static void main(String[] args) {
		Drink one = new Drink();
		Drink two = new Drink();
		Drink three = new Drink();
		one.name = "Coffee";
		two.name = "Tea";
		three.name = "Pepsi";

		TreeSet<Drink> treeset = new TreeSet<Drink>();
		treeset.add(three);
		treeset.add(two);
		treeset.add(one);

		Iterator i1 = treeset.iterator();
		while (i1.hasNext()) {
			Drink drinkObj = (Drink) i1.next();
			System.out.println(drinkObj.name);
		}

	}
}