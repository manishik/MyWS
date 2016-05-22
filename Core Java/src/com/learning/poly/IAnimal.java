package com.learning.poly;

public abstract interface IAnimal { // remember

	public static final int i = 100; // remember

	void eat();

	String sleep();

	void behave();

	//Can have a class declaration inside interface
	public class Test {
		int i;
		void go() {
			System.out.println("In Go"); 
			System.out.println("Value of i= "+i);
		}
	}

	//Can have a abstract class declaration inside interface
	public abstract class Test1 {
		int i;
		void go() { }
		//Can have a interface declaration inside abstract class
		interface i1 {	void go();	}
	}

	//Can have a interface declaration inside interface
	interface I1 { void behave(); }

	Test t1 = new Test();
	class oneMore{
		void method(){
			Test t1 = new Test();
			t1.go();
		}
	}
}

interface I1 { void aMethod(); }

class C1 implements I1 {
	int i;

	void go() {
		IAnimal iAni;
	}

	public static void main(String[] args) {
		System.out.println("Hey");
		I1 i1 = new C1();
		i1.aMethod();
	}

	public void aMethod() {
		System.out.println("Overriding");
	}
}

