package com.learning.scjpDumpPdfExamples;

public class T2 {

	public static void main(String[] args) {
		Foo foo = new Bar();
		foo.addFive();
		System.out.println("Value: " + foo.a);
	}

}

class Foo {
	public int a;

	public Foo() {
		a = 3;
	}

	public void addFive() {
		System.out.println("Foo:addFive");
		a += 5;
	}
}

class Bar extends Foo {
	public int a;

	public Bar() {
		a = 8;
	}

	public void addFive() {
		System.out.println("Bar:addFive");
		this.a += 5;
	}
}