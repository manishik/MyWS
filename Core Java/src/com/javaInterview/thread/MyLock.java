package com.javaInterview.thread;

public class MyLock {
	
	private Resource resourceA = new Resource();
	private Resource resourceB = new Resource();
	public int read() {
		synchronized (resourceA) { // May deadlock here
			synchronized (resourceB) {
				return resourceB.value + resourceA.value;
			}
		}
	}

	public void write(int a, int b) {
		synchronized (resourceB) { // May deadlock here
			synchronized (resourceA) {
				resourceA.value = a;
				resourceB.value = b;
			}
		}
	}
}

class Resource {
	public int value;
}