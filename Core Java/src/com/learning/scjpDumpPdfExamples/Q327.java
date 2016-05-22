package com.learning.scjpDumpPdfExamples;

public class Q327 extends Thread {
	public static void main(String[] args) {
		Q327 t = new Q327();
		t.start();
		t.run();
		t.doIt();

	}

	public void run() {
		System.out.println("Run. ");
	}

	public void doIt() {
		System.out.println("doIt. ");
	}
}
