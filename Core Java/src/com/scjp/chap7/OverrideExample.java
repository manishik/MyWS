package com.scjp.chap7;

public class OverrideExample {
	public static void main(String[] args) {
		int x = 15;
		DataAccess1 da = new DataAccess1();
		assert da.dataIsAccesible() : "Data is not acceptable";
		System.out.println("Value of x: " + x);
	}
}

class DataAccess1 {
	public boolean dataIsAccesible() {
		return false;
	}
}