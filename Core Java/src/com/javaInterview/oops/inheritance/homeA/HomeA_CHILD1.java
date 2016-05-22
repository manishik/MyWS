package com.javaInterview.oops.inheritance.homeA;

public class HomeA_CHILD1 extends HomeA_MOTHER {

	//overriding 
	public void homeADoMethod() {
		System.out.println("HomeAChild1:homeADoMethod..");
	}
	
	public void homeADoMethod(String doThis) {
		System.out.println("HomeAChild1:homeADoMethod is "+doThis);
	}
	
	//new child method..
	void homeAChildMethod(){
		System.out.println("homeAChildMethod..");
	}
	

}
