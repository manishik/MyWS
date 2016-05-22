package com.javaInterview.statics;

class AClass {
	public AClass() {
		System.out.println("AClass Constructor");
	}

	static {
		System.out.println("AClass Static Block");
	}
}

class BClass extends AClass {
	public BClass() {
		System.out.println("BClass Constructor");
	}

	static {
		System.out.println("BClass Static Block");
	}
}

class CClass extends BClass {
	public CClass() {
		System.out.println("CClass Constructor");
	}

	static {
		System.out.println("CClass Static Block");
	}
}

public class StaticCalls extends CClass {

	static {
		System.out.println("StaticCalls Static Block");
	}

	public StaticCalls() {
		System.out.println("StaticCalls Constructor");
	}

	public static void main(String[] args) {
		System.out.println("StaticCalls:main");
		StaticCalls t1Obj = new StaticCalls();
	}

}
