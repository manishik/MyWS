package com.learning.scjpDumpPdfExamples;

public class T1 {

	public static void main(String[] args) {
		int x = 5;
		T1 p = new T1();
		p.doStuff(x);
		System.out.println(" main x = " + x);
		System.out.println(" main x++ = " + x++);
		System.out.println(" main ++x = " + ++x);
	}

	void doStuff(int x) {
		//System.out.println(" doStuff ++x = " + ++x);
		System.out.println(" doStuff x++ = " + x++);
	}
}
