package com.learning.Basics;

public class thisAndSuper extends P1 {

	public static void main(String[] args) {
		P1 p1 = new thisAndSuper();
		p1.aMethod();
		
		P1 p11 = new P1();
		p11.aMethod();
		
		/*thisAndSuper thisAndSuper = new thisAndSuper();
		thisAndSuper.aMethod();*/
	}

	void aMethod() {
		System.out.println("In aMethod of thisAndSuper class");
		//System.out.println("this.getClass() = " + this.getClass());
		System.out.println("super.getClass() = " + super.getClass());
		//System.out.println(this.getClass().equals(super.getClass()));
	}

}

class P1 {

	void aMethod() {
		System.out.println("In aMethod of P1 class");
		System.out.println("this.getClass() = " + this.getClass());
		System.out.println("super.getClass() = " + super.getClass());
	}

	void anotherMethod() {
		System.out.println("Fuck You...");
	}
}