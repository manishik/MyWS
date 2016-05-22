package com.learning.Z;

public class Pass2 {
	static int x = 6;
	int m = 10;
	public static void main(String[] args) {
		Pass2 p = new Pass2();
		x = p.doStuff(x);
		System.out.println("main x = " + x);
		int z = p.doStuff(10);
		System.out.println("main z = " + z);
	}

	int doStuff(int x) {
		System.out.println("doStuff x = " + x++);
		System.out.println("x = "+x);
		return add(x);
	}
	
	int add(int a){
		a += 2;
		System.out.println("a = "+a);
		return a;
	}
}
