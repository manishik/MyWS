package com.learning.scjpDumpPdfExamples;

class Beta {

	public void bar(int... x) {}

	private void bar(int x) {}

	private void foo() { System.out.println("Beta:foo()"); }
}

public class Alpha extends Beta {

	// Can do both
	//public void foo(){}
	protected void foo() {}
	//private can be changed to public or protected in the subclass
	//but the reverse is not true.  

	public void bar(int x) {} //Override
	
	public void bar(int x, int y) {} //Overloaded in this class
	
	public int bar(String s){return 1;} //Overloaded in this class
	
	/*public int bar(int x) { //Can't change return type for overriding
		return x;
	}*/
	
}
