package com.learning.assorted;

public abstract class Organization {

	static int i = 100;
	String s1 = "This is a String s1 defined in abstract class Organization";

	static String[] s2 = { "Manish", "is" };

	public abstract String study();

	protected abstract void haveFun();

	public void eat() {
		System.out.println("Method eat() in abstract class Organization");
	}

	void work() {
		System.out.println(i);
		System.out.println(s1);
		eat();
	}

	int add(int a, int b) {
		return a + b;
	}

	public static void main(String[] args) {
		System.out.println("In main() of abstract class Organization");
		System.out.println("value of i = "+i);
	}
}

class Class {
	private static Organization org;

	public static void main(String[] args) {
		System.out.println("In main() of Test class");
		Class t = new Class();

		t.aMethod();
	}
	void aMethod(){
		System.out.println("Inside aMethod");
	}

}
