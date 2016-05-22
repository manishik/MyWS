package com.javaInterview.exceptions;

public class NestedTryCatch {

	public static void main(String[] args) {
		int result = foo();
		System.out.println("Result = " + result);
	}

	static int foo() {
		int i = 0;
		try {
			System.out.println("Inside try");
			//System.out.println("First Exception here = "+10/0);
			try {
				System.out.println("Inside inner try");
				i++;
				System.out.println("i = "+i);
				//System.exit(0);
				//System.out.println("Second Exception here = " + 20 / 0);
				try {
					System.out.println("Inside inner inner try");
					System.out.println("Third Exception here = " + 30 / 0);
					System.out.println("i = "+i);
					return i++;
				} catch (Exception e) {
					System.out.println("Inside inner inner catch");
					e.printStackTrace();
					System.out.println("i = "+i);
					return --i;
				} finally {
					System.out.println("Inside inner inner finally");
					System.out.println("i = "+i);
					return i++;
				}
			} catch (Exception e) {
				System.out.println("Inside inner catch");
				e.printStackTrace();
				return 22;
			} finally {
				System.out.println("Inside inner finally");
				System.out.println("i = "+i);
				return i;
			}
		} catch (Exception e) {
			System.out.println("Inside catch");
			e.printStackTrace();
			return 2;
		} finally {
			System.out.println("Inside finally");
			System.out.println("i = "+i);
			return ++i;
		}
	}
}
