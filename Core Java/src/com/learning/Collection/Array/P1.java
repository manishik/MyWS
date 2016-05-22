package com.learning.Collection.Array;

public class P1 {

	int instArrayVar[] = new int[10];

	public static void main(String[] args) {

		int localArrayVar[] = new int[10];
		System.out.println(localArrayVar[6]);
		P1 p1 = new P1();
		System.out.println(p1.instArrayVar[8]);
		
		//array of objects
		P1 p[] = new P1[10];
		p[0] = new P1();
		System.out.println(p[0].instArrayVar[9]);
		System.out.println(p[1]);
	}

}
