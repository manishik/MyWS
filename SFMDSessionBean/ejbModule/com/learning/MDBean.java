package com.learning;

import javax.ejb.Stateful;

@Stateful(name = "mulDiv")
public class MDBean implements IMD {

	private int a;
	private int b;
	
	public int multiply(int x, int y) {
		a = x;
		b = y;
		int z = x*y;
		System.out.println("Result of multiplication = "+z);
		return z;
	}
		
	public int divide() {
		int q =  a/b;
		System.out.println("Result of division = "+q);
		return q;
	}

}
