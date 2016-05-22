package com.javaInterview.statics;

public class StaticVarTest {

	static int i = 10;
	
	public static void main(String[] args) {

		StaticVarTest staticVarTest = new StaticVarTest();
		
		staticVarTest.i = 20;
		
		System.out.println(i);
		
		StaticVarTest staticVarTest1 = new StaticVarTest();
		staticVarTest1.i= 30;
		System.out.println(i);
		
		
		System.out.println(StaticVarTest.i);
	}

}
