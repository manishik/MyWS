package com.javaInterview.innerClass;

public class MethodLocalInnerClass {

	private int a = 10;
	private String s = "Outer class variable";
	
	void aMethod() {
		final String s1 = "Local variable";
		final int i = 1;
		//double j = 3.4d;
		final AnotherClass anotherClass = new AnotherClass();
		class MethodInnerClass {
			void doS() {
				System.out.println("a = " + a); //Outer class private variable
				System.out.println("s = " + s); //Outer class private variable
				//System.out.println("j = " + j);//cannot refer variable which is not final
				System.out.println("s1 = " + s1);// Local variable has to be final
				System.out.println("i = " + i);// Local variable has to be final
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