package com.learning.inheritence;

public class T1 {

	public static void main(String[] args) {
		T1 obj = new T1();
		T1.foo();
		Class.foo();
		//Class obj1 = (Class)obj; //java.lang.ClassCastException //Bomb at runtime
		T1 obj2 = new Class();
		obj2.foo();
		obj2.aMethod();		//Overridden method gets called
	}
	
	static void foo(){
		System.out.println("T1:foo");
	}
	void aMethod(){
		System.out.println("T1:aMethod");
	}

}


class Class extends T1{
	static void foo(){
		System.out.println("Class:foo");
	}
	void aMethod(){							//Override
		System.out.println("Class:aMethod");
	}
}