package com.learning.poly;

abstract class AbstractClass {

	// Non-abstract Method
	void doNothing() {
		System.out.println("doNothing()");
	}

	int go() {
		return 5;
	}

	// abstract Method
	abstract void aMethod();

	static {
		System.out.println("Abstract class:static block");
	}
	
	public AbstractClass(){
		System.out.println("Inside AbstractClass Constructor");
	}

}

public class AClass extends AbstractClass {
	
	public AClass(){
		System.out.println("Inside AClass Constructor");
	}
	
	public static void main(String[] m) {
		System.out.println("Inside main");
		AClass aClass = new AClass();
	}

	// have to override abstract Method
	void aMethod() {
	}
}