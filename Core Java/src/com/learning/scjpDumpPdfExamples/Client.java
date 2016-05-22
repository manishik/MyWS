package com.learning.scjpDumpPdfExamples;

class A {
	String name = "A";

	String getName() {
		return name;
	}

	String greetings() {
		return "Class A";
	}
}

class B extends A {
	String name = "B";

	String greetings() {
		return "Class B";
	}
}

public class Client {
	public static void main(String[] args) {
		A a = new A();
		A b = new B();
		System.out.println(a.greetings() + " has name " + a.getName());
		System.out.println(b.greetings() + " has name " + b.getName());
	}

}
