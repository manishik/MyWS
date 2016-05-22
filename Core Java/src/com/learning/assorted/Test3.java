package com.learning.assorted;

public class Test3 {
	
	//instance variables
	String t = "Test instance variable t";
	private int i = 10;
	
	//Constructor
	Test3(){
		final class C{
			C(){
				i = 20;
				System.out.println(t);
			}
			void aMethod(){
				System.out.println("Hey");
				System.out.println(i);
			}
		}
		
		C cc = new C();
		cc.aMethod();
	}
	
	//Business Methods 
	void aMethod(){
		System.out.println("Hey Hey");
	}
	
	//main method
	public static void main(String[] args) {
		Test3 t1 = new Test3();
		Test3 t2 = new Test3();
		/*Test t2;
		t2 = t1;*/
		
		if (t1.equals(t2))
			System.out.println("they're equal");
		else{
			System.out.println("they're not equal");
		}
		
		if (t1 == t2)
			System.out.println("they're equal");
		else{
			System.out.println("they're not equal");
		}
		
		/*anotherClass aCl = new anotherClass();
		aCl.aMethod();*/
		
		if (t1 instanceof Object)
			System.out.println("t1's an Object");
	}
}

/*class anotherClass{
	int j;
	public anotherClass(){
		j = 10;
		System.out.println("anotherClass");
		System.out.println("Value of j = "+j);
	}
	anotherClass(){
		j = 10;
		System.out.println("anotherClass");
		System.out.println("Value of j = "+j);
	}
	void aMethod(){
		System.out.println(j);
	}
}*/