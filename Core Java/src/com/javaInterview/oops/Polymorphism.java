package com.javaInterview.oops;

interface Humans {
	void learn();
}

class Parent implements Humans {
	void parent() {
		System.out.println("In parent()");
	}

	public void learn() {
		System.out.println("Parent:learn()");
	}
}

class Child extends Parent {
	void child() {
		System.out.println("In child()");
	}

	public void learn() {
		System.out.println("Child:learn() Overriding Parents learn()");
	}

	void method() {
		System.out.println("Child:method()");
	}
}

class GrandChild extends Child {
	void grandChild() {
		System.out.println("In GrandChild()");
	}

	void method() {
		System.out.println("GrandChild:method()");
	}
}

class Polymorphism {
	public static void main(String[] args) {
		Parent parentRefchildObj = new Child();// Parent can point to sub-class
		parentRefchildObj.parent();
		parentRefchildObj.learn();
		// parentRefchildObj.child();//Compiler Error //Can't see childs methods, needs typecast
		((Child) parentRefchildObj).child(); // Calling the Child method

		// Child obj2 = new Parent();//Compiler Error

		Child child = (Child) parentRefchildObj; // downcast
		child.method();

		Child childObj = new Child();
		Parent parentObj = childObj; // upcast with no explicit cast
		Parent parentObj1 = (Parent) childObj; // upcast with an explicit cast

		Humans human1 = new GrandChild();
		human1.learn();

		Child childRefgrandchildObj = new GrandChild();
		childRefgrandchildObj.method();
	}
}