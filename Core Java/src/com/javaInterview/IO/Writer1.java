package com.javaInterview.IO;

import java.io.*;

public class Writer1 {

	public static void main(String[] args) {
		try {
			boolean newFile = false;
			File myDir = new File("mydir");
			myDir.mkdir();
			
			File file = new File("fileWrite1.txt");
			System.out.println(file.exists()); // look for a real file
			newFile = file.createNewFile(); // maybe create a file!
			FileWriter fw = new FileWriter(file); 
			fw.write("howdy\nfolks\n"); // write characters to the file
			fw.flush(); // flush before closing
			fw.close(); // close file when done
		} catch (IOException e) {
		}
	}

}
