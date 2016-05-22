package com.scjp.chap6;

//designed to fail
class FaultySwitch {
	public static void main(String[] args) {
		byte x = 5;
		switch (x) {
		case 5:
			System.out.println("five");
			// case 130: //Compiler error
			System.out.println("one thirty");
		}

	}
}
