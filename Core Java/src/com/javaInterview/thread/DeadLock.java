package com.javaInterview.thread;

public class DeadLock {
	public static String Lock1 = "Manish";
	public static String Lock2 = "Indudhar";

	public static void main(String args[]) {

		Thread1 thread1 = new Thread1();

		// remember below 2 lines
		Thread2 T2 = new Thread2();
		Thread thread2 = new Thread(T2);

		// starting thread for class that extends Thread Class
		thread1.start();

		// starting thread for class that implements Runnable interface
		thread2.start();
	}

	//remember the sequence, it's Lock1 and then Lock2
	private static class Thread1 extends Thread {
		public void run() {
			synchronized (Lock1) {
				System.out.println("Thread 1: Holding lock 1...");
					try {
						Thread.sleep(2000);
					} catch (InterruptedException e) {
					}
				System.out.println("Thread 1: Waiting for lock 2...");
				synchronized (Lock2) {
					System.out.println("Thread 1: Holding lock 1 & 2...");
				}
			}
		}
	}

	//remember the sequence, it's Lock2 and then Lock1 (reverse) 
	private static class Thread2 implements Runnable {
		public void run() {
			synchronized (Lock2) {
				System.out.println("Thread 2: Holding lock 2...");
				try {
					Thread.sleep(3000);
				} catch (InterruptedException e) {
				}
				System.out.println("Thread 2: Waiting for lock 1...");
				synchronized (Lock1) {
					System.out.println("Thread 2: Holding lock 1 & 2...");
				}
			}
		}
	}

	//Solve the deadlock by reversing the locking order in any class
	
}
