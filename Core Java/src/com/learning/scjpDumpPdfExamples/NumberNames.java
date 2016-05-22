package com.learning.scjpDumpPdfExamples;

import java.util.HashMap;
import java.util.Set;

public class NumberNames {

	private HashMap<String,Integer> map = new HashMap<String, Integer>();
	
	public void put(String name, int value){
		map.put(name,value);
	}
	
	public Set<String> getNames(){
		return map.keySet();
	}
	
	public static void main(String[] args) {

		NumberNames nm = new NumberNames();
		nm.put("one", 1);
		nm.put("two", 2);
		nm.put("three", 3);
		nm.put("three", 3);
		nm.put("three", 3);
		nm.put("three", 3);
		System.out.println(nm.getNames());
		
	}

}
