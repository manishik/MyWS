package com.learning.scjpDumpPdfExamples;

public class TastBox {
	Integer i;
	int j;

	public static void main(String[] args) {
		TastBox t = new TastBox();
		t.go();
	}

	public void go() {
		try {
			j = i; //java.lang.NullPointerException here
			System.out.println(j);
			System.out.println(i);
		} catch (Exception e) {
			System.out.println("Null pointer");
			//e.printStackTrace();
		} finally {
			System.out.println("In finally");
		}
	}

}