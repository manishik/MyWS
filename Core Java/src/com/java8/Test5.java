package com.java8;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.stream.Collectors;

public class Test5 {
	public static void main(String args[]) {
		
		/*List<Integer> numbersList = Arrays.asList(1, 1, 2, 4, 5, 5, 7, 45, 55, 55, 8, 9, 10, 10);
		
		System.out.println("Number List = " + numbersList);

		List<Integer> newNumberList = numbersList.stream().distinct().collect(Collectors.toList());

		System.out.println("New Number List = " + newNumberList.stream().sorted().collect(Collectors.toList()));*/
		
		List<Integer> listOfInts = new ArrayList<Integer>();
		listOfInts.add(5);listOfInts.add(1);listOfInts.add(1);listOfInts.add(7);listOfInts.add(15);listOfInts.add(15);listOfInts.add(55);
		listOfInts.add(33);listOfInts.add(23);listOfInts.add(23);listOfInts.add(59);listOfInts.add(555);
		
		System.out.println("Number List = " + listOfInts);

		System.out.println("New Number List = " + listOfInts.stream().distinct().sorted().collect(Collectors.toList()));
		
		//iterating using streams
		listOfInts.stream().forEach(i -> System.out.println(i));
		System.out.println("-----------");
		//normal iteration using forEach()
		listOfInts.forEach(j -> System.out.println(j));
	}
}
