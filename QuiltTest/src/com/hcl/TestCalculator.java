package com.hcl;

import junit.framework.TestCase;

public class TestCalculator extends TestCase {

	private Calculator calObj = new Calculator();

	public void testaddInt() {
		System.out.println("Testing Integer addition");
		int a = calObj.addInt(25, 20);
		assertTrue(a == 45);
	}

	public void testsubInt() {
		System.out.println("Testing Integer subtraction");
		int a = calObj.subInt(10, 5);
		assertTrue(a == 5);
		//assertTrue("Success", a == 5);
		assertEquals("Equal", 5, a);
	}

	public void testaddFloat() {
		System.out.println("Testing Float addition");
		float b = calObj.addFloat(11f, 22l);
		assertEquals(b, 33f);
		
	}

	public void testsubFloat() {
		System.out.println("Testing Float subtraction");
		float b = calObj.subFloat(22f, 11l);
		assertEquals(b, 11f);
	}

}
