package com.learning.thread;

class SimpleThread extends Thread {
	public SimpleThread(String str) {
		super(str);
	}

	public synchronized void run() {
		for (int i = 0; i < 2; i++) {
			System.out.println(i + " " + Thread.currentThread().getName());
			try {
				sleep((int) (Math.random() * 2000));
			} catch (InterruptedException e) {
			}
		}
		System.out.println("DONE! " + getName());
	}
	
	public static void main(String[] args){
			
		new SimpleThread("Nandini").start();
		new SimpleThread("Manish").start();
	}
	
}

/*class SimpleThread implements Runnable {

	public void run() {
		for (int i = 0; i < 10; i++) {
			System.out.print(i);
		}
	}

	public static void main(String[] args) {
		SimpleThread st = new SimpleThread();
		Thread t1 = new Thread(st);
		t1.start();
		Thread t2 = new Thread(st);
		t2.start();
	}
}*/