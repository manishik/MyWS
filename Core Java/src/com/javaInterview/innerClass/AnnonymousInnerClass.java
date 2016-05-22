package com.javaInterview.innerClass;

//The whole point of making an anonymous inner class is to override one or more methods of the superclass Or to implement methods of an interface

public class AnnonymousInnerClass {
	public static void main(String[] args) {
		Ball ball = new Ball() {
			public void hit() {
				System.out.println("You hit it!");
			}
		};
		ball.hit();
	}

	interface Ball {
		void hit();
	}
}