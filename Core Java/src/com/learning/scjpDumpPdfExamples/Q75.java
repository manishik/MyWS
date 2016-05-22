package com.learning.scjpDumpPdfExamples;

public class Q75 {

	public static void main(String[] args) {
		
		/*T2 t2Obj = new T2();
		t2Obj.testIfA();
		T2.testIfA();*/
		
		testIfA();
	}

	public static void testIfA() {
		if (testIfB("True")) {
			System.out.println("True");
		} else {
			System.out.println("Not true");
		}
	}

	public static Boolean testIfB(String str) {
		return Boolean.valueOf(str);
	}
	
	 
}
