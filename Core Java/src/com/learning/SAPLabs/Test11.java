package com.learning.SAPLabs;

public class Test11 {

	public static void main(String[] args) {
		int i = 0;
		Test11 test11 = new SubSubTest11();
		System.out.println(test11.process(i));
	}

	int process(int i) {
		i++;
		return i;
	}

}

class SubTest11 extends Test11 {
	int process(int i) {
		i++;
		return super.process(i);
	}
}

class SubSubTest11 extends SubTest11 {
	int process(int i) {
		i++;
		return super.process(i);
	}
}