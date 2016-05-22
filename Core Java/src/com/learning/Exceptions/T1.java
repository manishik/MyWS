package com.learning.Exceptions;

public class T1 {

	public static void main(String[] args) {
		T1 t1 = new T1();
		t1.method1();
	}

	void method1() {
		System.out.println("In Method1");
		try {
			method2();
		} catch (Exception exception) {
			System.out.println("An Exception has been caught in method1");
		} finally {
			System.out.println("finally method1");
		}
	}

	void method2() {
		System.out.println("In Method2");
		try {
			method3();
		} catch (ArithmeticException arithmeticException) {
			System.out.println("An ArithmeticException has been caught in method2");
		} catch (Exception exception) {
			System.out.println("An Exception has been caught in method2");
		} finally {
			System.out.println("finally method2");
		}
	}

	void method3() {
		System.out.println("In Method3");
		method4();
	}

	void method4() throws ArithmeticException {
		System.out.println("In Method4");
		int i = 10 / 0;
	}

}
