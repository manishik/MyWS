package com.hcl;

import junit.framework.TestCase;

public class TestCalc extends TestCase {

	private Calc calcObj;
	
	protected void setUp() throws Exception {
		System.out.println("Inside setUp()");
		calcObj = new CalcImpl();
	}

	public void testAddInt() {
		System.out.println("Testing addInt()");
		int tempInt = calcObj.addInt(11, 11);
		assertEquals("Should be Equal", 22, tempInt);
	}

	public void testSubFloat() {
		System.out.println("Testing subFloat()");
		float tempFloat = calcObj.subFloat(13f, 10l);
		assertEquals("Should be Equal", 3.0f, tempFloat);
	}
	
	protected void tearDown() throws Exception {
		System.out.println("Inside tearDown()");
		calcObj = null;
	}
	
}