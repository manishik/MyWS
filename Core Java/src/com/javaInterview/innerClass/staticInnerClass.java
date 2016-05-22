package com.javaInterview.innerClass;

public class staticInnerClass {

	private String s1 = "staticInnerClass";

	static class InnerStaticClass extends staticInnerClass implements Interface {
		static {
			int i = 10;
			aMethod();
		}

		static void aMethod() {
			System.out.println("Inside static aMethod() of InnerStaticClass");
		}

		void someMethod() {
			System.out.println("Inside someMethod of InnerStaticClass");
		}

		public void go() {
			System.out.println("Inside Overridden go() of Interface of InnerStaticClass");
		}
	}

	public static void main(String[] args) {
		System.out.println("Inside main of staticInnerClass");

		InnerStaticClass.aMethod(); // Directly calling the static method

		InnerStaticClass innerStaticClass = new InnerStaticClass();
		innerStaticClass.someMethod();
		innerStaticClass.aMethod();// Calling static method using the instance of the class
		innerStaticClass.go();
	}
}

interface Interface {
	void go();
}

class AClass {
	public static void main(String[] args) {
		System.out.println("Inside main of AClass");
		staticInnerClass.InnerStaticClass ins = new staticInnerClass.InnerStaticClass();
		ins.aMethod();
		ins.go();
	}
}