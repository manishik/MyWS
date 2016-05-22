package com.learning.scjpDumpPdfExamples;

import java.util.ArrayList;
import java.util.Collection;
import java.util.HashSet;
import java.util.Set;
import java.util.TreeSet;

public class TestSet {

	enum Example{ONE, TWO, THREE, TEN, FOUR, TWENTY, ZERO};
	public static void main(String[] args) {
		Collection coll = new ArrayList();
		coll.add(Example.ZERO);
		coll.add(Example.ONE);
		coll.add(Example.THREE);
		coll.add(Example.TWO);
		coll.add(Example.ONE);
		coll.add(Example.THREE);
		coll.add(Example.THREE);
		coll.add(Example.THREE);
		coll.add(Example.TEN);
		Set set = new HashSet(coll);
		System.out.println("Set = "+set);
		set = new TreeSet(set);
		System.out.println("Sorted Set = "+set);
	}

}
