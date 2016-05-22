package com.learning.poly;

class Alpha {
	public void foo(String... args) {
		System.out.println("Alpha:foo");
	}

	public void bar(String a) {
		System.out.println("Alpha:bar");
	}
}

public class Beta extends Alpha {

	public void foo(String a) { //Overloaded in the subclass
		System.out.println("Beta:foo");
	}

	public void bar(String a) { //Overrriding in the subclass
		System.out.println("Beta:bar");
	}

	public static void main(String[] args) {
		Alpha a = new Beta();
		Beta b = (Beta) a;
		a.foo("test");
		b.foo("test");
		a.bar("test"); //Overridden method is called
		b.bar("test");
	}

}
