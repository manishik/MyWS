package com.learning.SAPLabs;

public class ThreadCheck extends Thread {

	public static void main(String[] args) {
		ThreadCheck threadCheck = new ThreadCheck();
		threadCheck.run();
	}

	public void start() {
		for (int i = 0; i < 10; i++) {
			System.out.println("Value of i = " + i);
		}
	}

}
