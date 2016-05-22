package com.javaInterview.equalsHashCode;

public class Employee {

	private int age;

	public Employee(int age) {
		this.age = age;
	}

	public boolean equals(Object obj) {
		Employee emp = (Employee) obj;
		if (emp.age == this.age)
			return true;
		return false;
	}

	public int hashCode() {
		return age;
	}
}
