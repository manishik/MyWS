package com.javaInterview.string;

public class WordsCharacterCount {

	public static void main(String[] args) {

		String str = "This is a Test String";

		String[] words = str.split(" ");
		
		System.out.println("Number of words = " + words.length);
		
		for(String word : words) {
		    System.out.println(word + ": " + word.length());
		}

	}

}
