package com.learning.poly;

public class Animal {

	public String noise() {
		return "animal-noise";
	}

	public static void main(String[] args) {
		Animal ani = new Dog1();
		// Cat c = (Cat)ani; //ClassCastException is thrown here
		// System.out.println(c.noise());

		Object o = new int[] { 1, 2, 3 };
		int[] intArray = (int[]) o;
		for (int i : intArray) {
			System.out.print(i);
		}

		int[] i3 = new int[4];
		i3[0] = 23;

		String[] s1 = new String[4];
		s1[0] = new String("Manish");
		s1[1] = new String("is");
		s1[2] = new String("great");
		s1[3] = new String("programmer");
				
		for(String s:s1){
			System.out.println(s);
		}
		
		Dog1[] d = new Dog1[4];
		d[0] = new Dog1();
		
	}//end of main()
	
}

class Dog1 extends Animal {
	public String noise() {
		return "dog-noise";
	}
}

