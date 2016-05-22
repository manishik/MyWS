package com.learning.assorted;

public class GoTest {

	public static void main(String[] args) {
		Sente a = new Sente();
		a.go();
		Globan b = new Globan();
		b.go();
		Stone c = new Stone();
		c.go();
	}
}

class Sente implements Go {
	public void go() {
		System.out.println("go in Sente");
	}
}

class Globan extends Sente {
	public void go() {
		System.out.println("go in Globan");
	}
}

class Stone extends Globan implements Go {
}

interface Go {
	public void go();

	public String toString();
}