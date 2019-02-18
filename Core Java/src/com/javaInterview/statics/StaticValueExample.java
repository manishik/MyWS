package com.javaInterview.statics;

public class StaticValueExample {

	static int a = 66;

	public static void main(String[] args) {
		System.out.println("static 'a' Inside main(): " + a);
		printNext();
		System.out.println("static 'a' Inside main(): " + a);
		StaticValueExample instance1 = new StaticValueExample();
		instance1.changeMethod();
		System.out.println("static 'a' Inside main(): " + a);
		StaticValueExample instance2 = new StaticValueExample();
		instance2.changeMethod();
		System.out.println("static 'a' Inside main(): " + a);
	}

	public static void printNext() {
		a++;
		System.out.println("static 'a' Inside printNext(): " + a);
	}

	void changeMethod() {
		int num = 10;
		a++;
		a = a + num;
		System.out.println("static 'a' Inside changeMethod(): " + a);
	}
}
