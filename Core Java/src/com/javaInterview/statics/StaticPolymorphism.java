package com.javaInterview.statics;

public class StaticPolymorphism {

	public static void main(String[] args) {
		Parent obj = new Child();
		obj.method(); // Redefined static method never gets called
		((Parent) new Child()).method(); // same invocation as above
		obj.aMethod(); // Can see all parent methods //Can't see childs 'new static methods'

		Child childObj = new Child();
		childObj.method1();
	}
}

class Parent {
	static void method() {
		System.out.println("Parent:static:method");
	}

	static void aMethod() {
		System.out.println("Parent:static:aMethod");
	}
}

class Child extends Parent {
	static void method() {
		System.out.println("Child:static:method");
	}

	static void method1() {
		System.out.println("Child:static:method1");
	}
}