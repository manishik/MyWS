package com.javaInterview.innerClass;

public class AnnonymousWonderfulClass {

	void go() {
		Bar b = new Bar();
		b.doStuff(new Foo() {
			public void foof() {
				System.out.println("foofy");
			} // end foof method
		}); // end inner class def, arg, and b.doStuff stmt.
	} // end go()
	
	
	/*public static void main(String[] args) {
		AnnonymousWonderfulClass class1 = new AnnonymousWonderfulClass();
		class1.go();
	}*/
	
} // end class

interface Foo {
	void foof();
}

class Bar {
	void doStuff(Foo f) {
	}
}
