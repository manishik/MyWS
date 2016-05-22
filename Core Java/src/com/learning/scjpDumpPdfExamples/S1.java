package com.learning.scjpDumpPdfExamples;

public class S1 {
	public static void main(String[] args){
		String test = "This is a test String";
		//String[] tokens = test.split("\s"); //Compilation fails
		
		String[] tokens1 = test.split("/s");
		System.out.println(tokens1.length);
		
		String[] tokens2 = test.split(" ");
		System.out.println(tokens2.length); //count the number of words in the String
	}
}
