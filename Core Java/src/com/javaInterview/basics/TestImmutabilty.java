package com.javaInterview.basics;

import java.util.Date;

class TestImmutabilty {
	public static void main(String[] args) {
		ImmutableClass im = ImmutableClass.createNewInstance(100, "test", new Date());
		System.out.println(im);
		tryModification(im.getImmutableField1(), im.getImmutableField2(), im.getMutableField());
		ImmutableClass im1 = ImmutableClass.createNewInstance(55, "Some", new Date());
		System.out.println(im1);
	}

	private static void tryModification(Integer immutableField1, String immutableField2, Date mutableField) {
		immutableField1 = 10000;
		immutableField2 = "test changed";
		mutableField.setDate(10);
	}
}