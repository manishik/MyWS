package com.javaInterview.innerClass;

public class AnnonymousInnerClass1 {

	class Popcorn {
		public void pop() {
			System.out.println("popcorn");
		}
	}

	class Food {
		Popcorn popcorn = new Popcorn() {
			public void sizzle() {
				System.out.println("anonymous sizzling popcorn");
			}

			public void pop() {
				System.out.println("anonymous popcorn");
			}
		};

		public void popIt() {
			popcorn.pop(); // OK, Popcorn has a pop() method
			// popcorn.sizzle(); // Not Legal! Popcorn does not have sizzle()
		}

	}

	public static void main(String[] args) {
		AnnonymousInnerClass1.Popcorn popcorn = new AnnonymousInnerClass1().new Popcorn();
		popcorn.pop();
		
		AnnonymousInnerClass1.Food food = new AnnonymousInnerClass1().new Food();
		food.popIt();
	}

}
