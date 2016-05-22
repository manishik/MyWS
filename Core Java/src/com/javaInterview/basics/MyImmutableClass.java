package com.javaInterview.basics;

//The immutable class which is made final 
final class MyImmutableClass {

	// instance var are made private & final to restrict the access
	// Values must be between 0 and 255.
	final private int red;
	final private int green;
	final private int blue;
	final private String name;

	private void check(int red, int green, int blue) {
		if (red < 0 || red > 255 || green < 0 || green > 255 || blue < 0
				|| blue > 255) {
			throw new IllegalArgumentException();
		}
	}

	// Constructor where we can provide the constant value
	public MyImmutableClass(int red, int green, int blue, String name) {
		check(red, green, blue);
		this.red = red;
		this.green = green;
		this.blue = blue;
		this.name = name;
	}

	// provide only methods which return the instance variable
	// & not change the values
	public String getName() {
		return name;
	}

	public int getRGB() {
		return ((red << 16) | (green << 8) | blue);
	}

	public MyImmutableClass invert() {
		return new MyImmutableClass(255 - red, 255 - green, 255 - blue,
				"Inverse of " + name);
	}
}