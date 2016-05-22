package com.javaInterview.IO;

import java.io.BufferedReader;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.IOException;

public class BufferedReaderExample {

	public static void main(String[] args) {
		// Java 7 way of reading a file
		try (BufferedReader br = new BufferedReader(new FileReader("C:\\testing.txt"))) {
			String sCurrentLine;
			while ((sCurrentLine = br.readLine()) != null) {
				System.out.println(sCurrentLine);
			}
		} catch (FileNotFoundException e) {
			// e.printStackTrace();
			System.out.println("Inside File Not Found Exception..");
			System.out.println("Message = " + e.getMessage());
		} catch (IOException e) {
			// e.printStackTrace();
			System.out.println("Inside IOException..");
			System.out.println("Message = " + e.getMessage());
		}

		// Java 6 way of reading a File
		BufferedReader br = null;
		try {
			String sCurrentLine;
			br = new BufferedReader(new FileReader("C:\\testing.txt"));
			while ((sCurrentLine = br.readLine()) != null) {
				System.out.println(sCurrentLine);
			}
		} catch (FileNotFoundException e) {
			// e.printStackTrace();
			System.out.println("Inside File Not Found Exception..");
			System.out.println("Message = " + e.getMessage());
		} catch (IOException e) {
			// e.printStackTrace();
			System.out.println("Inside IOException..");
			System.out.println("Message = " + e.getMessage());
		} finally {
			try {
				if (br != null)
					br.close();
			} catch (IOException ex) {
				ex.printStackTrace();
			}
		}
	}
}
