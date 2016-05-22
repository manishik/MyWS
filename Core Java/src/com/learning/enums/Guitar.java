package com.learning.enums;

import java.util.List;

enum GuitarInlay {
	NO_INLAY, DIAMONDS_AND_SQUARES, DOTS, TINY_DOTS, ABALONE_BORDER, ABALONE_ROSETTE
}

enum GuitarWood {
	MAHOGANY, INDIAN_ROSEWOOD, BRAZILIAN_ROSEWOOD, MADAGASCAR_ROSEWOOD, ZIRICOTE, BUBINGA, KOA,
	ADIRONDACK, SITKA, CEDAR, REDWOOD
}

public class Guitar {

	private String builder;
	private String model;
	private float nutWidth;
	private GuitarWood backSidesWood;
	private GuitarWood topWood;
	private GuitarInlay fretboardInlay;
	private GuitarInlay topInlay;
	private List features;

	private static final float DEFAULT_NUT_WIDTH = 1.6875f;

	public Guitar(String builder, String model, String... features) {
		this(builder, model, null, null, DEFAULT_NUT_WIDTH, null, null,
				features);
	}

	public Guitar(String builder, String model, GuitarWood backSidesWood,
			GuitarWood topWood, float nutWidth, String... features) {
		this(builder, model, backSidesWood, topWood, nutWidth, null, null,
				features);
	}

	public Guitar(String builder, String model, GuitarWood backSidesWood,
			GuitarWood topWood, float nutWidth, GuitarInlay fretboardInlay,
			GuitarInlay topInlay, String... features) {

		this.builder = builder;
		this.model = model;
		this.backSidesWood = backSidesWood;
		this.topWood = topWood;
		this.nutWidth = nutWidth;
		this.fretboardInlay = fretboardInlay;
		this.topInlay = topInlay;
		this.features = java.util.Arrays.asList(features);
	}
}
