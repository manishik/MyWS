package com.learning.assorted;

public class Hello {

	int a, b;

	Hello() {
		a=10;b=10;
	}

	Hello(int a, int b) {
		this.a = a;
		this.b = b;
		//Hello(); //Compilation Fails
	}

	public static void main(String[] args)throws Exception {
		Thread.sleep(3000); //wait 3 sec
		System.out.println("Sleep");
		Object obj = new Object();
		System.out.println(""+obj.hashCode());
		System.out.println(""+obj.toString());
	}

}
