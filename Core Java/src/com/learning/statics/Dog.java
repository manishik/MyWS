package com.learning.statics;

class Animal {
	static void doStuff() {
		System.out.print("animal. ");
	}
}

public class Dog extends Animal {

	static void dostuff() { // it's a redefinition, not an override
		System.out.print("dog. ");
	}

	public static void main(String[] args) {

		Animal[] a = { new Animal(), new Dog(), new Animal() };
		for (int x = 0; x < a.length; x++) {
			a[x].doStuff(); // invoke the static method
		}

		Animal animalObjRef = new Dog();

		animalObjRef.doStuff();

		((Dog) animalObjRef).doStuff();

		Dog dogObj = (Dog) animalObjRef;
		dogObj.dostuff();
	}
}
