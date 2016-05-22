package com.learning.thread;

public class ThreadType implements Runnable {
	public ThreadType() {
		Thread t = new Thread(this);
		t.setName("Daemon Thread");
		t.setDaemon(true);
		t.start();
		Thread t1 = new Thread(this);
		t1.setName("Non-Daemon Thread");
		t1.setDaemon(false);
		t1.start();
	}

	public void run() {
		System.out.println("Entry into " + Thread.currentThread().getName()
				+ " ...");
		try {
			if (Thread.currentThread().getName().equals("Daemon Thread"))
				Thread.sleep(5000);
			else
				Thread.sleep(2000);
		} catch (InterruptedException e) {
			e.printStackTrace();
		}
		System.out.println("Exiting " + Thread.currentThread().getName() + " ...");
	}

	public static void main(String[] a) {
		System.out.println("main thread started....");
		new ThreadType();
		try {
			Thread.sleep(10);
		} catch (InterruptedException e) {
			e.printStackTrace();
		}
		System.out.println("main thread exiting...");
	}
}
