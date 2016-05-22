package com.javaInterview.basics;

public class CreateObjWithoutNew {
	public static void main(String[] args) {
		String[] string = { "a", "b", "c" };
		try {
			Class classObj = Class.forName("com.javaInterview.basics.SomeClass");
			SomeClass someClass = (SomeClass) classObj.newInstance();
			someClass.method();
			someClass.anotherMethod();
		} catch (Exception e) {
			e.printStackTrace();
		}
	}

	void someMethod() {
		System.out.println("Inside CreateObjWithoutNew someMethod");
		try {
			SomeClass someClass1 = new SomeClass();
			SomeClass someClass2 = (SomeClass) someClass1.clone(); // For cloning "SomeClass" in this class, we have to override clone() in "SomeClass". 
			someClass2.method();
		} catch (Exception e) {
			e.printStackTrace();
		}
	}
}

class SomeClass implements Cloneable { //class needs to implement cloneable to be cloned within the same class. 
	private static String name = "Manish";
	private int age = 32;

	void method() {
		System.out.println("Inside SomeClass's method");
		System.out.println(name + " " + age);
	}

	void anotherMethod() {
		System.out.println("Inside SomeClass's anotherMethod");
		try {
			SomeClass someClass1 = new SomeClass();
			// To clone within the same class, the class has to implement Cloneable interface or else we will get runtime exception.
			SomeClass someClass2 = (SomeClass) someClass1.clone(); 
			someClass2.method();
		} /*catch (CloneNotSupportedException e) {
			e.printStackTrace();
		}*/ catch (Exception e) {
			e.printStackTrace();
		}
		
	}
	
	public Object clone() {
		Object object = null;
		try {
			object = super.clone();
		} catch (CloneNotSupportedException ex) {
		}
		return object;
	}

}

/*
 * we can create object without using new opearator.
 * 
 * 1) Using factory methods Ex:- NumberFormat obj=NumberFormat.getInstance();
 * 
 * 2)Using newInstance() method Ex:- Class c=Class.forName("SomeClassName");
 * SomeClassName obj=c.newInstance();
 * 
 * 3)using cloning Ex:- ClassName c1=new ClassName(); ClassName c2=c1.clone();
 */