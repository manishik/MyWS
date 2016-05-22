package com.javaInterview.basics;

public class PrimitivesEquality {

	int a = 10, b = 20, c = 30, d = c;

	public static void main(String[] args) {

		PrimitivesEquality primitivesEquality = new PrimitivesEquality();
		if (primitivesEquality.a == primitivesEquality.b) {
			System.out.println("Equal");
		} else {
			System.out.println("Unequal");
		}

		if (primitivesEquality.c == primitivesEquality.d) {
			System.out.println("Equal");
		} else {
			System.out.println("Unequal");
		}
	}
}
