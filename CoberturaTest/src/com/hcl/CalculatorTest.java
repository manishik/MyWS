package com.hcl;

import junit.framework.TestCase;

public class CalculatorTest extends TestCase {

	private Calculator calObj = new Calculator();

	public void testaddInt() {
		System.out.println("Testing Integer addition");
		int a = calObj.addInt(25, 20);
		assertTrue(a == 45);
	}

	public void testDivideInt() {
		System.out.println("Testing Integer divide");
		int a = calObj.divideInt(15, 5);
		assertTrue(a == 3);
		assertEquals("Equal", 3, a);

		System.out.println("Testing Integer divide again....");
		int b = calObj.divideInt(20, 0);
		assertTrue(b == 0);
		assertEquals("Equal", 0, b);
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
