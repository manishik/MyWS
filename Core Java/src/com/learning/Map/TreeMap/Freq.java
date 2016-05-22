package com.learning.Map.TreeMap;

import java.util.Map;
import java.util.TreeMap;

public class Freq {
	private static final Integer ONE = new Integer(1);

	public static void main(String args[]) {
		TreeMap treeMap = new TreeMap();

		treeMap.put("a Key", "a Value");
		treeMap.put("Java2s", "www.java2s.com");
		//treeMap.put(1, 1);

		System.out.println(treeMap.size() + " keys detected:");
		System.out.println(treeMap);
	}
}
