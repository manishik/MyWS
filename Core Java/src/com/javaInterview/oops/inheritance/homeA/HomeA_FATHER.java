package com.javaInterview.oops.inheritance.homeA;

public class HomeA_FATHER {
	
	public String f_name = "HomeA_FatherName";
	protected int f_age = 35;
	private double f_salary = 90000.00;

	private double homeAFatherSalaryMethod() {
		System.out.println("Father's salary secret...");
		return f_salary;
	}


}
