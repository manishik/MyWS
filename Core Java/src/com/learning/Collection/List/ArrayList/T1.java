package com.learning.Collection.List.ArrayList;

import java.util.ArrayList;
import java.util.List;

public class T1 {

	String S1 = "T1";
	int i = 5;
	static List arrayList;

	public static void main(String[] args) {
		HE he = new T1().new HE();

		String s2 = "";
		String s3 = null;

		/*
		 * arrayList.add(5); arrayList.add(6); arrayList.add(9);
		 * arrayList.add(50); arrayList.add("a"); arrayList.add("B");
		 * arrayList.add("A"); arrayList.add(he); arrayList.add(null);
		 * arrayList.add(s2); arrayList.add(s3);
		 */

		if (arrayList != null) {
			System.out.println("ArrayList  = " + arrayList);
			System.out.println("ArrayList Size = " + arrayList.size());
			he.foo();
		}
		ArrayList al = new ArrayList();
		al.add(5);
		al.add(6);
		al.add(9);
		al.add(8);
		al.add(1);
		al.add(1);
		al.add(99);
		al.add(50);
		al.add("a");
		al.add("a");
		al.add("a");
		al.add(null);
		al.add(he);
		
		
		System.out.println("AL  = " + al);

	}

	public class HE {
		int i = 10;
		String s1 = "Manish";

		void foo() {
			System.out.println(s1);
			System.out.println(i);
		}

		public String toString() {
			return s1;
		}
	}

}
