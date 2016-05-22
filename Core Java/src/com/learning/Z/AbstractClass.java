package com.learning.Z;

public abstract class AbstractClass {

	public static void main(String[] argv) {
		
		System.out.println("Inside abstract class main method");
		AbstractClass.foo();
	}

	public static void foo() {
		System.out.println("in static foo method of abstract class.");
	}

	/* And if you think about it, of course non-abstract static
	 * methods of an abstract class can be called. Isn't this
	 * how most "factory methods" work?
	 */
}
