package com.javaInterview.oops.inheritance.homeA;

public class HomeA_CHILD2 extends HomeA_FATHER {

	void homeAChild2Method(){
		
		//protected
		System.out.println("Fathers age = "+f_age); // protected variable can be directly accessed since HomeAChild2 extends HomeAFather
		new HomeA_MOTHER().homeAMotherAgeMethod(); // protected methods can be called since in same package
		
		//default
		new HomeA_MOTHER().homeAMotherMethod();
		System.out.println(""+new HomeA_MOTHER().m_role);
		
	}
	
	
	
}
