package com.learning.scjpDumpPdfExamples;

interface Foo1 {
}

class Alpha1 implements Foo1 {
}

class Beta1 extends Alpha1 {
}

class Delta extends Beta1 {
	public static void main(String[] args) {
		Beta1 x = new Beta1();
		// insert code here
		
		Alpha1 a = x;
		Foo1 f = (Delta)x; //java.lang.ClassCastException //Runtime Exception
		Foo1 f1 = (Alpha1)x;
		Beta1 b = (Beta1)(Alpha1)x;
		System.out.println("end of main()");
	}
}
