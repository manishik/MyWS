package com.learning.thread;

public class T1 {

	public static void main(String[] args) throws Exception {

		Aclass a = new Aclass();
		Thread t = new Thread(a);
		t.start();
		Thread t1 = new Thread(a);
		t1.start();
		Thread t2 = new Thread(a);
		t2.start();
		System.out.println("Started");
	}

}

class Aclass implements Runnable {
	public void run() {
		System.out.println("Inside run()");
		System.out.println(Thread.currentThread().getName());
	}
}