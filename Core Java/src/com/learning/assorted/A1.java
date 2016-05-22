package com.learning.assorted;

public class A1 {
	
	A1(){
		System.out.println("Inside Constructor A");
	}
	
	void A1(){
		System.out.println("Inside Constructor Void A");
	}
	
	void A1(int i){
		System.out.println("I = "+i);
		System.out.println("Inside Constructor Void A");
	}

	int a = 100;
	
	public static void main(String[] args) {
		
		int x[]={1,2,3};
		int y[] = new int[10];
		y[0]=333;
		
		System.out.println("y[4] = "+y[4]);
		
		System.out.println("x[1] = "+x[1]);
		
		boolean x1=false;
		boolean x2=true;
		System.out.print("x1 = "+x1+" x2 = "+x2 +" x1&x2 = ");
		System.out.println(x1&x2);
		
		A1 a_Obj = new A1();
		try{
			a_Obj.doStuff();
		}catch(ODC11Exception e){
			e.printStackTrace();
		}
	}
	
	public void doStuff()throws ODC11Exception {
		try{
			int i = 10;
			System.out.println("i before passing= "+i);
			int z = doStuff(i);
			System.out.println("i after passing= "+i);
			int b = doStuff(a);
			System.out.println("z = "+z);
			System.out.println("b = "+b);
		}catch(Exception e){
			throw new ODC11Exception();
		}
	}

	static public int doStuff(int i) throws ODC11Exception {
		return i+55;
	}
	
	static{
		int x = 0;
		System.out.println("Inside Static");
		System.out.println("x value inside static = "+x);
	}
	
	
	
}
