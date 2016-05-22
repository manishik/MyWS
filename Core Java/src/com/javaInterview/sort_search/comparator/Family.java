package com.javaInterview.sort_search.comparator;

public class Family {

	protected String name;
	protected int age;

	public Family() {
	}

	public Family(String name, int age) {
		this.name = name;
		this.age = age;
	}

	public String toString() {
		return this.name;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public int getAge() {
		return age;
	}

	public void setAge(int age) {
		this.age = age;
	}

}
