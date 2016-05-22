package com.learning.assorted;

public class Animal {
	String name;
	int number;

	static String[] strArray = {"One", "Two", "Three", "Four", "Five"};
	
	Animal(String name) {
		this.name = name;
	}
	
	Animal(int someNum) {
		this.number = someNum;
	}

	Animal() {
		this(makeRandomName());
		//this(makeRandomNumber());
	}

	static String makeRandomName() {
		/*int random = (int) (Math.random() * 5);
		String name = new String[] { "Fluffy", "Fido", "Rover", "Spike", "Gigi" }[random];
		return name;*/
		
		String[] name =  { "Fluffy", "Fido", "Rover", "Spike", "Gigi" };
		int randomName = (int)(Math.random() * name.length);
		return name[randomName];
	}

	static int makeRandomNumber() {
		int random = (int) (Math.random() * 3);
		int someNumber = new int[] { 6, 45, 56, 11, 2 }[random];
		return someNumber;
	}
	
	public static void main(String[] args) {
		/*Animal a = new Animal();
		System.out.println(a.name);
		Animal b = new Animal("Zeus");
		System.out.println(b.name);*/
		
		Animal c = new Animal();
		System.out.println(c.name);
		System.out.println(c.number);
		
		System.out.println(strArray.length);
	}
}
