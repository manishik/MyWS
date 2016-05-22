package com.learning.Construtor;

abstract class Zero {
	Zero() {
		System.out.print(0);
	}
}

class One extends Zero {
	One() {
		System.out.print(1);
	}
}

class Two extends One {
	Two() {
		System.out.print(2);
	}
}

class Three extends Two {
	Three() {
		System.out.print(3);
	}
}

public class Numbers {
	public static void main(String[] argv) {
		new Three();
	}
}
