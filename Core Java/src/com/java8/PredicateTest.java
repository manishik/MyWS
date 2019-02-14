package com.java8;

//A simple program to demonstrate the use 
// of predicate interface 
import java.util.*;
import java.util.function.Predicate;

public class Test4 {

	public static void main(String args[]) {

		// create a list of strings
		List<String> listOfString = Arrays.asList("Keshav", "Geek", "GEico", "g1", "GeeksQuiz", "QA", "Manish");

		// declare the predicate type as string and use
		// lambda expression to create object
		Predicate<String> predicate = (string) -> string.startsWith("Ge");

		// Iterate through the list
		for (String string : listOfString) {
			// call the test method
			if (predicate.test(string))
				System.out.println(string);
		}
	}
}
