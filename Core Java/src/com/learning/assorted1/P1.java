package com.learning.assorted1;

public class P1 {

	public static void main(String[] args) {

		short s = 10;
		P1 p1 = new P1();
		p1.method(10);
		short s1 = p1.method(s);
		System.out.println(s1);
		
	}

	public int method(int a) {
		System.out.println("Inside int " + a);
		return a;
	}

	public short method(short a) {
		System.out.println("Inside short " + a);
		a = (short)(a+100);
		return a;
	}
}
