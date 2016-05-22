package com.learning.inheritence;

public class A {

	private final int foo(int i) {
		return 11;
	}

	public static void main(String[] args) {
		A aobj = new A();
		Integer i1 = aobj.foo(33);
		System.out.println(i1);

		A a = new B();
		Integer i2 = a.foo(44);
		System.out.println(i2);
	}
}

class B extends A {
	private final int foo(int i) { //New method in class B, cannot see private methods in class A
		return 12;
	}

	private int bar(int j) {
		return 13;
	}
}