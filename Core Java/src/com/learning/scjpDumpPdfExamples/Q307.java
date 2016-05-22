package com.learning.scjpDumpPdfExamples;

public class Q307 {

	static void go() {
		RaceCar racer = new RaceCar();
		Car car = new RaceCar();
		Vehicle vehicle = new RaceCar();
		System.out.println(racer.speed() + ", " + car.speed() + ", "
				+ vehicle.speed());
	}

	public static void main(String[] args) {
		go();
	}

}

abstract class Vehicle {
	public int speed() {
		return 0;
	}
}

class Car extends Vehicle {
	public int speed() {
		return 60;
	}
}

class RaceCar extends Car {
	public int speed() {
		return 150;
	}
}
