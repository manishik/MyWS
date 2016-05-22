package com.learning.innerClass;

class D { }

abstract class E { }

class Z extends D {
	E makeE() {
		return new E() {           //Anonymous Inner Class implementing abstract class
		};
	}
}

public class MultiImplementation {
	static void takesD(D d) {
	}

	static void takesE(E e) {
	}

	public static void main(String[] args) {
		Z z = new Z();
		takesD(z);
		takesE(z.makeE());
	}
} 
