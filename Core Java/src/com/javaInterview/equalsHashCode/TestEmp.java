package com.javaInterview.equalsHashCode;

import java.util.HashSet;

public class TestEmp {
	public static void main(String[] args) {
		Employee emp1 = new Employee(23);
		Employee emp2 = new Employee(24);
		Employee emp3 = new Employee(25);
		Employee emp4 = new Employee(26);
		Employee emp5 = new Employee(27);

		Employee emp6 = new Employee(27);
		Employee emp7 = new Employee(24);

		HashSet<Employee> hs = new HashSet<Employee>();

		hs.add(emp1);
		hs.add(emp2);
		hs.add(emp3);
		hs.add(emp4);
		hs.add(emp5);

		// Adding Duplicates
		hs.add(emp6);
		hs.add(emp7);

		System.out.println("HashSet Size--->>> " + hs.size());
		System.out.println("hs.contains( new Employee(25))--->>> " + hs.contains(new Employee(25)));
		System.out.println("hs.remove( new Employee(24)--->>> " + hs.remove(new Employee(24)));
		System.out.println("hs.remove(emp1)--->>> " + hs.remove(emp1));
		System.out.println("Now HashSet Size--->>> " + hs.size());
	}
}
