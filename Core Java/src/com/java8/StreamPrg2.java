package com.java8;

import java.util.Arrays;
import java.util.HashSet;
import java.util.List;

public class StreamPrg2 {

	public static void main(String[] args) {

		List<String> myList = Arrays.asList("a1", "a2", "b1", "c2", "c1");
		//myList.stream().forEach(System.out::println);
		myList.stream().filter(s -> s.startsWith("c")).map(String::toUpperCase).sorted().forEach(System.out::println);

		HashSet<String> hs = new HashSet<String>();
		hs.add("Manish");
		hs.add("Manish");
		hs.add("Manish");

		//System.out.println(hs);
		hs.stream().forEach(System.out::println);
		hs.stream().map(String::toUpperCase).forEach(System.out::println);
	}

}
