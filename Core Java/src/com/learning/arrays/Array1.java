package com.learning.arrays;

//Java program to demonstrate 
//Array.spliterator() method 

import java.util.Arrays; 

public class Array1 { 
	public static void main(String[] args) 
	{ 

		// Get the Array 
		int intArr[] = { 10, 20, 15, 22, 35 }; 

		// To sort the array using normal sort 
		System.out.println("Integer Array: "
						+ Arrays.spliterator(intArr)); 
	} 
} 

