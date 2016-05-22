package com.javaInterview.basics;

public class DefaultValuesForPrimitives {
	byte b; short s; int i; long l;
	float f; double d;
	boolean bool;
	char c; String string;

	public static void main(String[] args) {
		DefaultValuesForPrimitives t1 = new DefaultValuesForPrimitives();
		t1.method();
	}

	void method() {
		System.out.println(b);
		System.out.println(s);
		System.out.println(i);
		System.out.println(l);

		System.out.println(f);
		System.out.println(d);

		System.out.println(bool);
		System.out.println(c);
		System.out.println(string);
	}
}
