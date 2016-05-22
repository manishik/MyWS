package com.citi;

public class T1 {

	public static void main(String[] args) {
		System.out.println("This is line 1." + System.getProperty("line.separator") + "This is line 2.");
		System.out.println(System.getProperty("user.name"));
		System.out.println(System.getProperty("os.name"));
		System.out.println(System.getProperty("os.version"));
		System.out.println(System.getProperty("os.arch"));
		
	}
	
}
