package com.learning.scjpDumpPdfExamples;

class TestA {
	public void start() {
		System.out.println("TestA");
	}
}

public class TestB extends TestA {
	public void start() {
		System.out.println("TestB");
	}

	public static void main(String[] args) {
		new TestB().start();
		new TestA().start();
		((TestA)new TestB()).start();
	}
}