package com.javaInterview.oops.inheritance.homeA;

public class HomeA_MOTHER {

	public String m_name = "HomeAMotherName";
	private int m_age = 30;
	private double m_salary = 50000.00;
	String m_role = "Mother of family...";
	
	private double homeAMotherSalaryMethod() {
		System.out.println("Mother's salary secret...");
		return m_salary;
	}

	protected int homeAMotherAgeMethod() {
		System.out.println("HomeAMother: protected homeAMotherAgeMethod..");
		System.out.println("Only Kids + anyone at home (package)...");
		return m_age;
	}

	public String homeANameMethod() {
		System.out.println("HomeAMother: public homeAMotherNameMethod..");
		return m_name;
	}
	
	public void homeADoMethod() {
		System.out.println("HomeAMother: public homeADoMethod..");
	}
	
	//overloaded
	public void homeADoMethod(String doThis) {
		System.out.println("HomeAMother:homeADoMethod is "+doThis);
	}
	
	//default access 
	void homeAMotherMethod() {
		System.out.println("HomeAMother: homeAMotherMethod..");
	}
	
}
