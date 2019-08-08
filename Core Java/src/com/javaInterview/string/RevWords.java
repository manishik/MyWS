package com.javaInterview.string;

public class RevWords {

	public static void main(String[] args) {
		
		String input = "Manish Indudhar";
		
		
		System.out.println(input);
		
		String [] out = input.split(" ");
		
		
		for(String output: out) {
			System.out.println(output);
		}
	}

}
