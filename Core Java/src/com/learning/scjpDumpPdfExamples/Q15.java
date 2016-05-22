package com.learning.scjpDumpPdfExamples;

public class Q15 {

	enum Example {ONE, TWO, THREE};
	
	public static void main(String[] args) {
		
		System.out.println(Example.ONE==Example.ONE);
		System.out.println(Example.ONE.equals(Example.ONE));
		
		System.out.println(Example.ONE.compareTo(Example.ONE));
		System.out.println(Example.ONE.compareTo(Example.TWO));
	}
}

//Remember
enum Element {
	EARTH, WIND, FIRE { public String info() { return "HOT"; } };
	public String info() { return "element"; }
}