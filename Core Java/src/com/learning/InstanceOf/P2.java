package com.learning.InstanceOf;

import java.util.ArrayList;
import java.util.List;

public class P2 {
	public static void main(String[] args) {
		Person p = new Person("A");
		Animal a = new Animal("B");
		Thing t = new Thing("C");
		String text = "hello";
		Integer number = 1000;

		List<Object> list = new ArrayList<Object>();
		list.add(p);
		list.add(a);
		list.add(t);
		list.add(text);
		list.add(number);

		for (int i = 0; i < list.size(); i++) {
			Object o = list.get(i);
			if (o instanceof Person) {
				System.out.println("My name is " + ((Person) o).getName());
			} else if (o instanceof Animal) {
				System.out.println("I live in " + ((Animal) o).getHabitat());
			} else if (o instanceof Thing) {
				System.out.println("My color is " + ((Thing) o).getColor());
			} else if (o instanceof String) {
				System.out.println("My text is " + o.toString());
			} else if (o instanceof Integer) {
				System.out.println("My value is " + ((Integer) o));
			}
		}
	}
}

class Person {
	private String name;

	public Person(String name) {
		this.name = name;
	}

	public String getName() {
		return name;
	}
}

class Animal {
	private String habitat;

	public Animal(String habitat) {
		this.habitat = habitat;
	}

	public String getHabitat() {
		return habitat;
	}
}

class Thing {
	private String color;

	public Thing(String color) {
		this.color = color;
	}

	public String getColor() {
		return color;
	}
}
