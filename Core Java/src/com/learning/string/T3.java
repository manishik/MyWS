package com.learning.string;

public class T3 {

	public static void main(String[] args) {
		StringBuilder stringBuilder = new StringBuilder("123456789");
		stringBuilder.delete(1, 4);
		System.out.println(stringBuilder);

		stringBuilder.delete(0, 3).delete(1, 3).delete(2, 5).insert(1, "24");
		System.out.println(stringBuilder);

	}

}
