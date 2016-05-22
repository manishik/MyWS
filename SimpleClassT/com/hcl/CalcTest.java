//For testing 'Add class' we don't require 'Adding class'

package com.hcl;

import junit.framework.TestCase;

public class CalcTest extends TestCase {

	private Calc calcObj;
	
	protected void setUp() throws Exception {
		calcObj = new Calc();
	}
	
	public void testAddint() {
		System.out.println("Testing Integer addition");
		int a = calcObj.addint(25,20);
		assertTrue(a == 45);
	}

	public void testAddfloat() {
		System.out.println("Testing Float addition");
		float b = calcObj.addfloat(11f, 22l);
		assertEquals(b,33f);
	}
	
	protected void tearDown() throws Exception {
		calcObj = null;
	}

}
