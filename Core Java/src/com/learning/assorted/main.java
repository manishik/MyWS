package com.learning.assorted;

public class main extends Object {

	final int c = 10;

	static String[] s1 = { "Hey", "just checking" };

	public static void main(String[] args) {
		final int a = 8;
		final int b = 7;
		//b = 3;

		String[] s3 = { "Hey", "just checking" };

		System.out.println("Value of b = " + b);

		int x = a;
		x = b;

		switch (x) {

		case a:
			System.out.println("Hey I'm in case a");
			break;

		case b:
			System.out.println("Hey I'm in case b");
			main(2);
			break;

		case 3:
			System.out.println("Hey I'm in case 3");
			break;

		case 10:
			System.out.println("Hey I'm in case 10");
			break;

		default:
			System.out.println("Hey I'm in case default");
			break;
		}

	}

	public static void main(int args) {
		//main(s1); //StackOverflowError
	}

}

class OverridingMainMethod extends main {
	public static void main(String[] args) {
		System.out.println("Hey");
	}
}
