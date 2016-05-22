package com.learning.AccessModifiers;

class Class {
	private int i;
	public int y;

	Class() {
		i = 10;
		y = 100;
		System.out.println("Class: i = " + i);
		System.out.println("Class: y = " + y);

	}
}

public class T1 extends Class {

	public int y = 1111;

	T1() {
		//super();
		y = 20;
		System.out.println("T1: y = " + y);
	}
	
	void aMethod(){
		System.out.println("Y = "+y);
	}

	public static void main(String[] args) {

		/*Class c = new Class();
		System.out.println(c.y);*/

		T1 t1Obj = new T1();
		System.out.println(t1Obj.y);
		t1Obj.aMethod();
	}

}
