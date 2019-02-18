package com.javaInterview.basics;

public class PassByValueEx {

	public static void main(String[] args) {
		Dog dog = new Dog();
		dog.setName("Max");
		dog.setTailLen("Short Tail");
		Change change = new Change();
		change.foo(dog);
		System.out.println(dog.getName() + "\t" + dog.getTailLen());
	}
}

class Change {
	public void foo(Dog someDog) {
		someDog.setName("Bubble"); // AAA
		someDog.setTailLen("Long Tail");
		someDog = new Dog(); // BBB
		someDog.setName("Rowlf"); // CCC
	}
}

class Dog {
	String name;
	String tailLen;

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}
	
	public String getTailLen() {
		return tailLen;
	}

	public void setTailLen(String tailLen) {
		this.tailLen = tailLen;
	}
}