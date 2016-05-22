package com.learning.scjpDumpPdfExamples;

class classA {}

class classB extends classA {}

class classC extends classA {}

class Testing {
	classA p0 = new classA();
	classB p1 = new classB();
	classC p2 = new classC();
	classA p3 = new classB();
	classA p4 = new classC();

	void aMethod() {
		p0 = p1;
		// p2 = p1; 		// Cannot convert from classB to classC
		// p2 = p4; 		// Cannot convert from classA to classC
		// p2 = (classC)p1; // Cannot cast from classB to classC
		p1 = (classB) p3;
		p2 = (classC) p4;
	}
}