package com.learning.Map.HashMap;

import java.util.ArrayList;
import java.util.Collections;
import java.util.HashMap;
import java.util.Iterator;
import java.util.List;
import java.util.Set;

import com.learning.poly.IAnimal;

public class HashMapEx {

	public static void main(String[] args) {
		Dog dog1 = new Dog("Bubble");
		dog1.bark();
		dog1.eat();

		Dog dog2 = new Dog();
		dog2.bark();

		Cat cat1 = new Cat();
		cat1.purr();

		HashMap<Integer, Dog> hashMap = new HashMap<Integer, Dog>();
		hashMap.put(1, dog1);
		hashMap.put(56, new Dog());
		hashMap.put(56, new Dog());
		hashMap.put(55, new Dog());
		hashMap.put(33, new Dog());
		hashMap.put(66, new Dog());
		hashMap.put(1000, new Dog());
		hashMap.put(500, new Dog());

		Set set = hashMap.keySet();

		List list = new ArrayList();

		list.addAll(set);
		Collections.sort(list); //Sorting the List

		Iterator i1 = set.iterator();
		System.out.println("Map's keys = ");
		while (i1.hasNext()) {
			System.out.println(i1.next());
		}

		Iterator i2 = list.iterator();
		System.out.println("Map Key Values after Sorting = ");
		while (i2.hasNext()) {
			System.out.println(i2.next());
		}

		boolean b1 = hashMap.containsValue(dog1);
		System.out.println(b1);

		boolean b2 = hashMap.containsKey("Manish");
		System.out.println(b2);

		boolean b3 = hashMap.containsValue(dog2);
		System.out.println(b3);
	}
}

class Dog implements IAnimal {

	private String name;

	public Dog() {
		name = "Max";
	}

	Dog(String name) {
		this.name = name;
	}

	void bark() {
		System.out.println(name + " barking");
	}

	public void behave() {
		System.out.println(name + " guards the house");
	}

	public void eat() {
		System.out.println(name + " eating");
	}

	public String sleep() {
		System.out.println(name + " sleeping");
		return null;
	}

}

class Cat {

	private String name;

	public Cat() {
		name = "Tom";
	}

	void purr() {
		System.out.println(name + " purring");
	}

}