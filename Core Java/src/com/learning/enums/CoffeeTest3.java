package com.learning.enums;

enum CoffeeSize1 {
	BIG(8), HUGE(10), OVERWHELMING(16);
	// the arguments after the enum value are "passed"
	// as values to the constructor
	
	CoffeeSize1(int ounces) {
		this.ounces = ounces; // assign the value to an instance variable
	}

	private int ounces; // an instance variable each enum value has
	
	public int getOunces() {
		return ounces;
	}
}

public class CoffeeTest3 {
	CoffeeSize1 size; // each instance of CoffeeTest3 has-a CoffeeSize1 enum
	public static void main(String[] args) {
		CoffeeTest3 drink1 = new CoffeeTest3();
		drink1.size = CoffeeSize1.BIG;
		CoffeeTest3 drink2 = new CoffeeTest3();
		drink2.size = CoffeeSize1.OVERWHELMING;
		System.out.println(drink1.size.getOunces()); // prints 8
		System.out.println(drink2.size.getOunces()); // prints 16
	}
}
