package com.learning.Exceptions;

public class T3 {

	static void test() throws Error {
		if (true)
			throw new AssertionError();
		System.out.print("test ");
	}

	public static void main(String[] args) {
		try {
			test();
		}catch (AssertionError ae) {
			System.out.println("exception is "+ae.getMessage());
		}		
		catch (Exception ex) {
			System.out.print("exception ");
		}
		System.out.print(" end ");
	}

}
