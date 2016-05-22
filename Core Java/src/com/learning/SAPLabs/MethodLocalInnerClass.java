package com.learning.SAPLabs;

public class MethodLocalInnerClass {

	private String str = "Outer class variable";
	
	void aMethod() {
		final String string = "Local variable";
		final AnotherClass anotherClass = new AnotherClass();
		class MethodInnerClass {
			void doS() {
				System.out.println("s = " + str); //Outer class private variable
				System.out.println("s1 = " + string);// Local variable has to be final
				System.out.println("AnotherClass variable = "+anotherClass.anotherMethod());
			}
		}
		MethodInnerClass mic = new MethodInnerClass(); //Need to be after class declaration
		mic.doS();
	}
	
	public static void main(String[] args) {
		MethodLocalInnerClass anObj = new MethodLocalInnerClass();
		anObj.aMethod();
	}
	
}

class AnotherClass {
	private int i1 = 10;
	String anotherMethod() {
		System.out.println("AnotherClass variable = "+i1);
		return "String";
	}
}