package com.learning.Map.HashMap;

public class T3 {
	public static void main(String[] args) {
		Change change = new Change();
		Thread thread = new Thread(change);
		thread.start();
		System.out.println("varI = "+change.getVarI());
	}
}

class Change implements Runnable {

	public int varI = 0;

	public void run() {
		System.out.println("Inside Run");
		varI = 1;
		setVarI(varI);
	}

	public int getVarI() {
		return varI;
	}

	public synchronized void setVarI(int someNo) {
		this.varI = someNo;
	}
	
}