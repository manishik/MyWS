package com.learning.enums;

import com.learning.enums.Class.Direc;

class Nav {
	public enum Direction {
		NORTH, SOUTH, EAST, WEST
	}
}

public class Sprite {
	Nav.Direction d = Nav.Direction.NORTH; //Need full package structure
}

class Class {
	public enum Direc {
		NORTH, SOUTH, EAST, WEST
	}
}

class AnotherClass {
	Direc d = Direc.NORTH; //Needs an import statement if enum is in other class
}