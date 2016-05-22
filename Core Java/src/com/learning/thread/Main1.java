package com.learning.thread;

class MyThread1 implements Runnable {
	int count;

	MyThread1() {
		count = 0;
	}

	public void run() {
		System.out.println("MyThread starting.");
		try {
			do {
				Thread.sleep(500);
				System.out.println("In MyThread, count is " + count);
				count++;
			} while (count < 6);
		} catch (InterruptedException exc) {
			System.out.println("MyThread interrupted.");
		}
		System.out.println("MyThread terminating.");
	}
}

public class Main1 {
	public static void main(String args[]) {
		System.out.println("Main thread starting.");
		Thread thrd = new Thread(new MyThread1());
		thrd.start();
		try {
			thrd.join();
		} catch (InterruptedException exc) {
			System.out.println("Main thread interrupted.");
		}
		System.out.println("Main thread ending.");
	}
}
