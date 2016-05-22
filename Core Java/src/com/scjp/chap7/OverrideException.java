package com.scjp.chap7;

import java.io.*;

public class OverrideException {
	public void someMethod() throws IOException {
	}
}

class SubClassLegalOne extends OverrideException {
	public void someMethod() throws IOException {
	}
}

class SubClassLegalTwo extends OverrideException {
	public void someMethod() {
	}
}

class SubClassLegalThree extends OverrideException {
	public void someMethod() throws EOFException, FileNotFoundException {
	}
}

class SubClassIllegalOne extends OverrideException {
	//public void someMethod() throws ClassNotFoundException {} //Compiler Error
}

class SubClassIllegalTwo extends OverrideException {
	//public void someMethod() throws Exception {} //Compiler Error
}

class SubClassIllegalThree extends OverrideException {
	//public void someMethod() throws IOException, ClassNotFoundException {} //Compiler Error
}