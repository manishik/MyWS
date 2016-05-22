package com.learning.Z;

import java.util.ArrayList;
import java.util.Iterator;

public class T2 {

	public static void main(String[] args) {
		SE se = new SE();
		SE se1 = new SE();
		SE se2 = new SE();

		SSE sse = new SSE();
		SSE sse1 = new SSE();
		SSE sse2 = new SSE();

		Manager manager = new Manager();
		Manager manager1 = new Manager();
		Manager manager2 = new Manager();

		ArrayList<Emp> al = new ArrayList<Emp>();
		al.add(se);
		al.add(se1);
		al.add(se2);
		al.add(sse);
		al.add(sse1);
		al.add(sse2);
		al.add(manager);
		al.add(manager1);
		al.add(manager2);

		System.out.println(al);

		Iterator i1 = al.iterator();
		while (i1.hasNext()) {
			Object o = i1.next();
			if (o instanceof SSE) {
				SSE swe = (SSE) o;
				System.out.println(swe);
			}
		}
	}

}

interface Emp {

}

class SE implements Emp {

	String name = "Manish";

	public String toString() {
		return name;
	}

}

class SSE implements Emp {
	String name = "Ritu";

	public String toString() {
		return name;
	}
}

class Manager implements Emp {
	String name = "Arvind";

	public String toString() {
		return name;
	}
}
