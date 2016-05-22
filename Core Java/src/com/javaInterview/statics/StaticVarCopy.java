package com.javaInterview.statics;

public class StaticVarCopy {

	static boolean b = false;
	static int i = 10;
	
	public static void main(String[] args) {
		StaticVarCopy staticVarCopy = new StaticVarCopy();
		System.out.println(b);
		System.out.println(staticVarCopy.b  + " " +staticVarCopy.i);
		method();
		System.out.println(b);
		System.out.println(staticVarCopy.b);
		StaticVarCopy obj = new StaticVarCopy();
		System.out.println(b + " " +i);
		System.out.println(obj.b + " " +obj.i);
	}
	
	static void method(){
		b = true;
		i = 20;
	}

}
