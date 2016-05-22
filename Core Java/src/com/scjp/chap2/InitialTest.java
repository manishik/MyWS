package com.scjp.chap2;

public class InitialTest {
	int x;

	public static void main(String[] args) {
		new InitialTest().printIt();
	}

	public void printIt() {
		int y;
		int z;
		y = 2;
		System.out.println(x + " " + y);
		//System.out.println(z); //need to initialize local variable z 
	}
}
