package com.javaInterview.statics;

public class StaticMethodInheritence {

	public static int go(Integer i, Integer j) {
		System.out.println("StaticMethodInheritence:static:go()");
		int z = i + j;
		return z;
	}

	public static void main(String[] args) {
		int a = AnotherClass.go(10, 20);
		System.out.println(a);

		int b = StaticMethodInheritence.go(10, 60);
		System.out.println(b);
		
		StaticMethodInheritence staticMethodInheritence = new AnotherClass();
		int c = staticMethodInheritence.go(10, 2000); //Reference type determines which static method is selected.
		System.out.println(c);
		
		AnotherClass anotherClass = (AnotherClass)staticMethodInheritence;	//downcast
		int d = anotherClass.go(1, 2);
		System.out.println(d);
	}

}

class AnotherClass extends StaticMethodInheritence {
	public static int go(Integer i, Integer j) {
		System.out.println("AnotherClass:static:go()");
		int z = i - j;
		return z;
	}
}