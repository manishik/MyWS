package com.javaInterview.collections.listAndArrays;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

public class FinalArrayList {

	public static void main(String[] args) {

		//final keyword doesn't have any effect
		final List<String> list = new ArrayList<String>();
		list.add("Manish");
		list.add("Indudhar");
		list.add("Keshav");
		list.add("SomeName");
		list.add("Manish"); //adding duplicates
		
		System.out.println("List = "+list);
		
		List<String> unModList = Collections.unmodifiableList(list);
		
		//unModList.add("Mysore"); //cannot add another string //fails at runtime 
		System.out.println("UnmodifiableList = "+unModList);
	}

}
