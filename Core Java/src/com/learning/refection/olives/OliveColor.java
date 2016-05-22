package com.learning.refection.olives;

public enum OliveColor {
	BLACK("Black"), GREEN("Green"), GOLDEN("Golden");
	
	private String colorAsString;
	
	private OliveColor(String colorAsString) {
		this.colorAsString = colorAsString;
	}
	
	@Override
	public String toString() {
		return this.colorAsString;
	}
}
