package com.learning.SAPLabs;

public class Test13 {

	public static void main(String[] args) {
		Car car = new Ford();
		car.getClassName();
	}

}

class Car {
	void getClassName() {
		System.out.println("Car");
	}
}

class Ford extends Car {
	void getClassName() {
		System.out.println("Ford");
	}
}