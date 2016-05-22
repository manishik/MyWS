package com.learning.assorted;

public class Hcl {

	public static void main(String[] args) {
		System.out.println("Hey, now i'm a HCLite");

		//If Cov is just a class
		/*Cov myCov = new Cov();
		myCov.walking();
		String s2 = myCov.study();
		System.out.println(s2);
		myCov.haveFun();*/
		
		
		String x = "big surprise";
		System.out.println( x.toString() );
		
		String s = "Manish"+"Indudhar"+677;
		System.out.println(s);
		
	}
	
}

abstract class Cov extends Organization implements ICompany {
	
	int i = 200;
	
	void walking(){
		System.out.println(i);
	}
	
	public String study() {
		return "Studying";
	}
	
	protected void haveFun() { //Can have public access modifier but not private here
		System.out.println("Have fun in Covansys");
	}
	
}


final class ITC extends Organization implements ICompany{

	@Override
	protected void haveFun() {
		// TODO Auto-generated method stub
		
	}

	@Override
	public String study() {
		// TODO Auto-generated method stub
		return null;
	}

	public void behave() {
		// TODO Auto-generated method stub
	}

	public void eat() {
		// TODO Auto-generated method stub
		
	}

	public String sleep() {
		// TODO Auto-generated method stub
		return null;
	}
	
}
