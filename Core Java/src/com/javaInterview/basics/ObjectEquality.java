package com.javaInterview.basics;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.HashSet;
import java.util.List;
import java.util.Map;
import java.util.Set;
import java.util.TreeMap;

public class ObjectEquality {

	public static void main(String[] args) {
		Emp emp1 = new Emp();
		Emp emp2 = new Emp();
		Emp emp3 = emp2;
		Emp emp4 = new Emp();
		System.out.println("equals   " + emp1.equals(emp2));
		System.out.println("==       " + (emp1 == emp2));

		System.out.println("equals   " + emp2.equals(emp3));
		System.out.println("==       " + (emp2 == emp3));

		Emp emp5 = new Emp(2, "Nandini");
		Emp emp6 = new Emp(2, "Nandini");
		System.out.println("equals   " + emp5.equals(emp6));
		System.out.println("==       " + (emp5 == emp6));

		// emp1.method1(); emp2.method1(); emp3.method1(); emp4.method1();

		//Trying to add employee with same name in any collection 
		//Won't work for unique employees
		List<Emp> empList = new ArrayList<Emp>();
		empList.add(emp5);
		empList.add(emp6);
		System.out.println("ArrayList = " + empList);

		//Won't work for unique employees
		Set<List<Emp>> hs = new HashSet<List<Emp>>();
		hs.add(empList);
		System.out.println("HashSet of List = " + hs);

		// Won't work for unique employees
		Set<Emp> hs1 = new HashSet<Emp>();
		hs1.add(emp5);
		hs1.add(emp6);
		System.out.println("HashSet  = "+hs1);

		// Won't work for unique employees
		Map<Emp, String> hashMap = new HashMap<Emp, String>();
		hashMap.put(emp5, "N");
		hashMap.put(emp6, "N");
		System.out.println("HashMap = " + hashMap); // Will contain duplicate
													// employees with same name

		// Emp needs to implement Comparable so that unique employees with same
		// names will be eliminated.
		// TreeMap is not only used for sorting but for also unique elements
		Map<Emp, String> treeMap = new TreeMap<Emp, String>();
		treeMap.put(emp5, "N");
		treeMap.put(emp6, "N");
		System.out.println("TreeMap = " + treeMap);
	}
}

class Emp implements Comparable<Emp> {
	private int id;
	private String strName;
	public int age;

	Emp() {
		id = 1;
		strName = "Manish";
		age = 10;
	}

	Emp(int id, String strName) {
		this.id = id;
		this.strName = strName;
	}

	void method1() {
		System.out.println(id + " " + strName);
	}

	
	//is used to check if two objects with same name and id are equal or not
	public boolean equals(Object object) {
		if (object == null) {
			return false;
		}
		if (this.getClass() != object.getClass()) {
			return false;
		}
		if (this.id != ((Emp) object).id) {
			return false;
		}
		if (!this.strName.equals(((Emp) object).strName)) {
			return false;
		}
		return true;
	}

	public String toString() {
		return (id + " " + strName + " " + age);
	}

	// For sorting as-well as adding unique employee with names 
	// In this case, removing duplicate elements (employees with same name) 
	public int compareTo(Emp object) {
		if (!this.strName.equals(((Emp) object).strName)) {
			return -1;
		}
		return 0;
	}

}