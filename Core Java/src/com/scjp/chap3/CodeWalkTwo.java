package com.scjp.chap3;

class CodeWalkTwo {
	int x = 3;
	static int y = 2;

	public static void main(String[] args) {
		int x = 10;
		int y = 10;
		CodeWalkTwo boardWalk = new CodeWalkTwo();
		boardWalk.printIt();
		boardWalk.printIt(y);
	}

	{
		x = x + 1;
	}
	static {
		y += y; //y = y + y;
		y += 1; //y = y + 1;
		System.out.println("Y = "+y);
	}

	void printIt() {
		System.out.print(++x);
	}

	void printIt(int y) {
		System.out.print(" " + ++y);
	}

}
