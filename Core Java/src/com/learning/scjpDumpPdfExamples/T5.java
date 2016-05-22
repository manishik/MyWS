package com.learning.scjpDumpPdfExamples;

import java.util.LinkedList;
import java.util.List;
import java.util.Set;
import java.util.TreeSet;

public class T5 {

	public static void main(String[] args) {
		List<String> linkedList = new LinkedList();
		linkedList.add("Manish");
		linkedList.add("1");
		linkedList.add("3");
		linkedList.add("0");
		linkedList.add("81");
		linkedList.add("a");
		linkedList.add("A");
		Set set = new TreeSet(linkedList);
		System.out.println(linkedList);
		System.out.println(set);
	}

}
