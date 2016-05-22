package com.learning.Collection.List.ArrayList;

import java.util.ArrayList;
import java.util.Iterator;

class Cats {

	int size;

	String name = "Cattie";

	public void behave() {
		System.out.println("Burrrr..");
	}

	public void eat() {
		System.out.println("Cat eating");
	}

	public String sleep() {
		return "Cat Sleeping";
	}

}

public class New {

	public static void main(String[] manish) {

		ArrayList<Cats> catArrayList = new ArrayList<Cats>();

		Cats cat1 = new Cats();
		Leopard lepord1 = new Leopard();
		Tiger[] t1 = new Tiger[10];

		catArrayList.add(cat1);
		catArrayList.add(lepord1);
		for (int i = 0; i < t1.length; i++) {
			t1[i] = new Tiger();
			catArrayList.add(t1[i]);
		}

		if (catArrayList.contains(cat1)) {
			System.out.println("Object present");
		} else {
			System.out.println("Object not present");
		}

		Iterator i1 = catArrayList.iterator();
		while (i1.hasNext()) {
			Object o1 = i1.next();
			if (o1 instanceof Leopard) {
				Leopard lepord = (Leopard) o1;
				System.out.println(lepord.name);
			}
			if (o1 instanceof Tiger) {
				Tiger tiger = (Tiger) o1;
				System.out.println(tiger.name);
			}
		}
		
		System.out.println("cal Size = "+catArrayList.size());
	}
}

class Leopard extends Cats {

	String name = "Lepeee";

	int size = 10;

	public void behave() {
		System.out.println("Lurrrr");
	}

	public void eat() {
		System.out.println("Leopard eating");
	}

	public String sleep() {
		return "Leopard Sleeping";
	}

	public void Dance() {
		System.out.println("Leopard Dancing");
	}
}

class Tiger extends Cats {

	String name = "Tigeee";

	int size = 20;

	public void behave() {
		System.out.println("Growl");
	}

	public void eat() {
		System.out.println("Tiger eating");
	}

	public String sleep() {
		return "Tiger Sleeping";
	}

	public void Dance() {
		System.out.println("Tiger Dancing");
	}
}
