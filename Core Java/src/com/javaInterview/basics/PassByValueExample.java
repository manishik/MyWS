package com.javaInterview.basics;

public class PassByValueExample {

	int num = 10;

	public static void main(String[] args) {
		int number = 3; // local variable
		printNext(number);
		System.out.println("number Inside main(): " + number);

		PassByValueExample byValueExample = new PassByValueExample();
		byValueExample.changeMethod(byValueExample.num);
		System.out.println("num Inside main(): " + byValueExample.num);
	}

	public static void printNext(int number) {
		number++;
		System.out.println("number Inside printNext(): " + number);
	}

	void changeMethod(int number) {
		number++;
		System.out.println("number Inside changeMethod(): " + number);
	}
}
