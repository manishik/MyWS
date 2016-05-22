package com.learning.Exceptions;

public class T2 {

	public static void aMethod() throws ArithmeticException {
		int i = 10;
		try {
			int j = i / 0;
			System.out.println("In try");
		} catch (ArithmeticException ame) {
			System.out.println("Please don't divide any number by zero");
			System.out.println("i = "+i);
			//System.out.println("j = "+j);//Compilation error, Cannot access j
			throw ame;
			
		} catch (Exception e) {
			e.printStackTrace();
		}
	}

	public static void main(String[] args) {
		//aMethod(); //Not handling the exception
		try {
			aMethod();								
			System.out.println("In try of main()");
		} catch (ArithmeticException ame) {
			System.out.println("Handling ArithmeticException in main()");
		}
	}
}
