package com.learning.poly;

import java.util.HashMap;

class Pet implements IAnimal {

	public void behave() {
		System.out.println("Pet behaving in it's own way");
	}

	public void eat() {
		System.out.println("Pet eating");
	}

	public String sleep() {
		return "Pet Sleeping";
	}

}

class Dog extends Pet {

	int size;

	String Breed;

	public void bark() {
		System.out.println("Woff Woff");
	}

	public void eat() {
		System.out.println("Dog eating");
	}

	public String sleep() {
		return "Dog Sleeping";
	}
	
	public void charge(){
		System.out.println("Dog Charging");
	}

}

class Cat extends Pet {

	public void behave() {
		System.out.println("Cat behaving");
	}

	public void eat() {
		System.out.println("Cat eating");
	}

	public String sleep() {
		return "Cat Sleeping";
	}

	public void Dance() {
		System.out.println("Cat Dancing");
	}

}

public class Test {

	public static void main(String[] args) {

		Dog dog1 = new Dog();
		dog1.Breed = "Dalmation";
		dog1.size = 10;
		// d1.sleep();

		Dog dog2 = new Dog();
		dog2.size = 20;
		dog2.Breed = "German Shepard";

		Pet pet = new Pet();
		pet.eat();
		
		Pet pet1 = new Dog();
		pet1.eat(); // Calls the Dog eat method if Dog overrides the Pets eat
					// method or else calls the Pets eat method
					//pet1 cannot see charge method in Dog class
		
		final Pet pet2 = new Cat();
		pet2.behave();
		IAnimal a1 = new Dog();
		a1.behave();
		a1 = pet2; //cause Pet implements IAnimal
		a1.eat();

		IAnimal a2 = new Dog();
		a2.behave();
		Dog d3 = (Dog) a2;
		d3.eat();

		/*HashMap hm = new HashMap();
		hm.put("First Dog", dog1);
		hm.put("Second Dog", dog2);
		hm.put("1", new Integer(75));
		hm.put("k1", "Key 1");

		Dog dd1 = (Dog) hm.get("First Dog");
		System.out.println("First Dog size = " + dd1.size);
		System.out.println("First Dog Breed = " + dd1.Breed);

		System.out.println("Value = " + hm.get("1"));

		Dog dd2 = (Dog) hm.get("Second Dog");
		System.out.println("2nd Dog size = " + dd2.size);
		System.out.println("2nd Dog Breed = " + dd2.Breed);

		System.out.println("Key = " + hm.get("k1"));*/
	}
}
