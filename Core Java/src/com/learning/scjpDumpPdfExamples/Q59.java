package com.learning.scjpDumpPdfExamples;

public class Q59 {

	public static void main(String[] args) {
		
		D e = new E();
		e.bMethod();
		
		D e1 = (D)(new E()); //Explicit cast
		e1.bMethod();
	}

}

interface A1 {
	public void aMethod();
}

interface BB {
	public void bMethod();
}

interface C extends A1, BB {
	public void cMethod();
}

class D implements BB {
	public void bMethod() {
		System.out.println("D:bMethod");
	}
}

class E extends D implements C {
	public void aMethod() {
		System.out.println("E:aMethod");
	}

	public void bMethod() {
		System.out.println("E:bMethod");
	}

	public void cMethod() {
		System.out.println("E:cMethod");
	}
}