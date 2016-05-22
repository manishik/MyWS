package com.learning.enums;

enum CoffeeSize { BIG, HUGE, OVERWHELMING } // this cannot be private or protected

class Coffee {
	CoffeeSize size;
}

public class CoffeeTest1 {
	public static void main(String[] args) {
		Coffee drink = new Coffee();
		drink.size = CoffeeSize.BIG; // enum outside class
	}
}
