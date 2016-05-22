package com.learning.assorted;

class Test2 {
	
	int x;
	static int y;
	
	//Constructor
	Test2() {
		x= 2;
		y = 9;
		System.out.println("constructor");
	}
	
	static {
		System.out.println("static");
		int x = 55;
	}
	
	public void doSomething(){
		System.out.println("doSomething");
		System.out.println("X = "+x);
	}
	
	public static void main(String[] args) {
		Test2 t = new Test2();
		
		//Can access static variable in both ways
		System.out.println("Y = "+Test2.y);
		System.out.println("Y = "+t.y);
		
		System.out.println("X = "+t.x);
		t.doSomething();
	}

	
	
}
