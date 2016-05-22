package com.scjp.chap7;

class CodeWalkSix {
	public static void main(String[] args) {
		String stri = "inner";
		String stro = "outer";
		try {
			throw new Exception();
		} catch (Exception eo) {
			try {
				throw new Exception();
			} catch (Exception ei) {
				System.out.println(stri);
			} finally {
				System.out.println("finally");
			}
			System.exit(1);
		} finally {
			System.out.println("Manish");
			System.out.print(stro);
		}
		System.out.print(stro);
	}
}
