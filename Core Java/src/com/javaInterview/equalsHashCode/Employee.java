package com.javaInterview.equalsHashCode;

public class Employee {

	private String name;
	private int ssn;

	public Employee(int ssn) {
		this.ssn = ssn;
	}

	public boolean equals(Object obj) {
		Employee emp = (Employee) obj;
		if (emp.ssn == this.ssn)
			return true;
		return false;
	}

	public int hashCode() {
		return ssn;
	}
}
