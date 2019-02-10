package com.java8;

import java.util.Arrays;
import java.util.List;
import java.util.stream.Collectors;

public class StreamPrg1 {

	public static void main(String[] args) {
		List<Integer> number = Arrays.asList(2, 3, 4, 5);
		System.out.println("List of Number = " + number);
		List<Integer> square = (List<Integer>) number.stream().map(x -> x * x).collect(Collectors.toList());
		System.out.println("List of Squares = " + square);
	}

}
