package com.learning.thread;

public class One {
	public static void main(String[] args) {

		try {
			ThreadOne one = new ThreadOne();

			Thread thread = new Thread(one);
			thread.start();
			System.out.println("Started");
			thread.sleep(2000);
			thread.join();
			System.out.println("Interrupting..");
			thread.interrupt();
			System.out.println("Ended");
			
		} catch (InterruptedException e) {
			System.out.println("Interrupted");
		}

	}
}

class ThreadOne implements Runnable {

	public synchronized void run() {
		System.out.println("Inside run");
	}

}