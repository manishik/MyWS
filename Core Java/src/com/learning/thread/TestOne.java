package com.learning.thread;

public class TestOne implements Runnable {

	public static void main(String[] args) {
		Thread t = new Thread(new TestOne());
		t.start();
		System.out.println("Started");

		/*try {
			t.join();
		} catch (Exception e) {
			e.printStackTrace();
		}*/

		System.out.println("Completed");

	}

	public void run() {
		for (int i = 0; i < 4; i++) {
			System.out.println(i);
		}
	}

}
