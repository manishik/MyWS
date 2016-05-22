package com.learning.enums;

enum Color {

	RED("Red Color"), GREEN("Blue Color"), BLUE("Blue Color");

	private String displayName; // an instance variable each enum value has

	Color(){
	}
	
	Color(String displayName) {
		this.displayName = displayName;
	}

	public String toString() {
		return displayName;
	}
}

public class ColorTest {
	public static void main(String[] args) {
		//Color color = new Color(); //Cannot instantiate the type Color
		Color redColor = Color.RED;
		System.out.println(redColor);
		System.out.println(Color.BLUE);
	}
}
