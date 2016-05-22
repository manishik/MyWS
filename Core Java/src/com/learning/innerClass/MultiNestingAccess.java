package com.learning.innerClass;

public class MultiNestingAccess {
	public static void main(String[] args) {
		MNA mna = new MNA();
		MNA.A mnaa = mna.new A();
		MNA.A.B mnaab = mnaa.new B();
		mnaab.h();
		
		MNA.A aObj = new MNA().new A();
		MNA.A.B bObj = new MNA().new A().new B(); //Creating class B obj in one line
	}
} 

class MNA {
	private void f() {
		System.out.println("Inside f()");
	}

	class A {
		private void g() {
			System.out.println("Inside g()");
		}

		public class B {
			void h() {
				System.out.println("Inside h()");
				g();
				f();
			}
		}
	}
}
