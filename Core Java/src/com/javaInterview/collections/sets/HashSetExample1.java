package com.javaInterview.collections.sets;

import java.util.HashSet;

public class HashSetExample1 {

	public static void main(String[] args) {

		HashSet<Person> hashSet = new HashSet<Person>();

		Person person = new Person("Samarth");
		hashSet.add(person);
		Person person2 = new Person("SamartH");
		hashSet.add(person2);
		Person person3 = new Person("Manish");
		hashSet.add(person3);
		Person person4 = new Person("Nandini");
		hashSet.add(person4);
		Person person5 = new Person("Nandini");
		hashSet.add(person5);

		for (Person person6 : hashSet) {
			System.out.println(person6.getName());
		}
	}

}

class Person {

	private String name;

	public Person(String name) {
		if (name != "Manish") { // Do not let anybody add Manish
			this.name = name;
		} else {
			this.name = "Stupid";
		}
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		if (name != "Manish") {
			this.name = name;
		}
	}

	public int hashCode() {
		final int prime = 22;
		int result = 1;
		result = prime * result + ((name == null) ? 0 : name.hashCode());
		return result;
	}

	public boolean equals(Object obj) {
		Person person = (Person) obj;
		if (!this.name.equals(person.name)) {
			return false;
		} else {
			return true;
		}
	}

}