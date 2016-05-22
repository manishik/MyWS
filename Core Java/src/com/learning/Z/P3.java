package com.learning.Z;

public class P3 {
	public static void main(String[] args) {
		System.out.println(Thread.currentThread());
		foo();
		Thread.dumpStack();
	}

	static void foo() {
		System.out.println(Thread.currentThread().getName());
		System.out.println("Hey");
	}
}
