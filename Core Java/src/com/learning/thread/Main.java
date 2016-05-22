package com.learning.thread;

class MyResource {
	boolean ready = false;

	synchronized void waitFor() throws Exception {
		System.out.println(Thread.currentThread().getName()
				+ " is entering waitFor().");
		while (!ready)
			wait();
		System.out.println(Thread.currentThread().getName()
				+ " resuming execution.");
	}

	synchronized void start() {
		ready = true;
		notify();
	}
}

class MyThread implements Runnable {
	MyResource myResource;

	MyThread(String name, MyResource so) {
		myResource = so;
		new Thread(this, name).start();
	}

	public void run() {

		try {
			myResource.waitFor();
		} catch (Exception e) {
			e.printStackTrace();
		}
	}
}

public class Main {
	public static void main(String args[]) throws Exception {
		MyResource sObj = new MyResource();
		new MyThread("MyThread", sObj);
		for (int i = 0; i < 10; i++) {
			Thread.sleep(200);
			System.out.print(".");
		}
		sObj.start();
	}
}
