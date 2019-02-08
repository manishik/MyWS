package com.java8;

import java.util.HashMap;
import java.util.Map;

public class Test2 {

	public static void main(String[] args) {

		Map<String, Integer> nameMap = new HashMap<>();
		Integer value = nameMap.computeIfAbsent("John", s -> s.length());
		System.out.println("Value = " + value);
	}

}
