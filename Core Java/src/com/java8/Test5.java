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
		
		List<Integer> numList = new ArrayList<Integer>();
		numList.add(5);numList.add(1);numList.add(1);numList.add(7);numList.add(15);numList.add(15);numList.add(55);
		numList.add(33);numList.add(23);numList.add(23);numList.add(59);numList.add(555);
		
		System.out.println("Number List = " + numList);

		System.out.println("New Number List = " + numList.stream().distinct().sorted().collect(Collectors.toList()));
		
		numList.stream().forEach(i -> System.out.println(i));
		System.out.println("-----------");
		numList.forEach(j -> System.out.println(j));
	}
}
