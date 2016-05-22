package com.learning.scjpDumpPdfExamples;

public class Q309 {
	public static void main(String[] args) {
		Fooo fooo = new Barr();
		fooo.addFive();
		System.out.println("Value: " + fooo.a);
	}
}

class Fooo {
	public int a;
	public Fooo() {
		a = 3;
	}
	public void addFive() {
		a += 5;
	}
}

class Barr extends Fooo {
	public int a;
	public Barr() {
		a = 8;
	}
	public void addFive() {
		this.a += 5;
	}
}
