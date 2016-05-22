package com.learning.Z;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class P1 {

	public static void main(String[] args) throws IOException {

		//Use a BufferedReader to read characters from the console.
		char c;
	    BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
	    System.out.println("Enter characters, 'q' to quit.");
	    do {
	      c = (char) br.read(); //Need to handle exception
	      System.out.println(c);
	    } while (c != 'q');
		

	    //Read a string from console using a BufferedReader.
	    String str;
	    System.out.println("Enter lines of text.");
	    System.out.println("Enter 'stop' to quit.");
	    do {
	      str = br.readLine(); //Need to handle exception
	      System.out.println(str);
	    } while (!str.equals("stop"));

	    
	}

}
