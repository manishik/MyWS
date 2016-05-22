package com.javaInterview.innerClass;

public class OuterClass {

	private static int intA = 10;
	private final int intB = 100;
	private double doubleA = 10.77;

	private class MyInnerClass {
		final int x = 20;
		private long l1 = 20;

		// Cannot have anything static in Innner Class (Compiler Error), please refer staticInnerClass 
		// private static int i = 0;
		// static { System.out.println("In static"); }
		// public static void main(String[] args) { }
		
		void doS() {
			System.out.println("Inside doS of MyInnerClass");
			System.out.println("Printing value of OuterClass.intB = " + intB);
			System.out.println("Printing value of local variable x = " + x);
		}

		// Overloaded
		void doS(int c) {
			this.l1 = c;
		}

		public void setLong(int c) {
			this.l1 = c;
		}

		public long getLong() {
			return l1;
		}

		void seeOuter() {
			System.out.println("intB of OuterClass = " + intB);
			System.out.println("doubleA of OuterClass = " + doubleA);
		}
	} // End of MyInnerClass

	public void makeInner() {
		MyInnerClass in = new MyInnerClass(); // make an inner instance
		in.seeOuter();
	}

	public class MyInnerClass2 extends MyInnerClass {
		int x = 30;

		// Overriding
		void doS() {
			System.out.println("Inside overridden doS of MyInner2");
			System.out.println("Value of X = " + x);
		}
	}

	class MyInnerClass3 {
		private String str = "MyInnerClass3";

		void printSomething() {
			System.out.println(str);
		}
	}

	public static void main(String[] args) {

		// Can create inner class instance in 2 ways
		OuterClass.MyInnerClass myInnerClassObjRef = new OuterClass().new MyInnerClass(); // 1st way 
		MyInnerClass myInnerClassObjRef1 = new OuterClass().new MyInnerClass(); // 2nd way

		myInnerClassObjRef.seeOuter();
		myInnerClassObjRef1.doS();

		// Directly instantiating MyInner2
		MyInnerClass2 myInnerClass2ObjRef = new OuterClass().new MyInnerClass2();
		myInnerClass2ObjRef.doS();

		// Polymorphic way of instantiating MyInnerClass2
		MyInnerClass innerClass2ObjRef21 = new OuterClass().new MyInnerClass2();
		System.out.println("Polymorphism");
		innerClass2ObjRef21.doS();

		System.out.println("S = " + new OuterClass().new MyInnerClass3().str);
		new OuterClass().new MyInnerClass3().printSomething();
	}

	void someMethodOfOuterClass() {
		System.out.println(intA + " " + intB + " " + doubleA);
		System.out.println("Inside someMethodOfOuterClass");
	}

}
