package com.learning.scjpDumpPdfExamples;

public class Q74{
	static class A {
		void process() throws Exception {
			throw new Exception();
		}
		/*void process() {
			System.out.println("static A");;
		}*/
	}
	static class B extends A {
		void process() {
			System.out.println("static B ");
		}
	}
	public static void main(String[] args) {
		A a = new B();
		// a.process(); //Compilation error, need the handle the Exception
						//Use try catch
		//a.process();
	}
}
