package com.learning.scjpDumpPdfExamples;

public class Test {
	public enum Dogs {
		collie, harrier, shepherd
	};

	public static void main(String[] args) {
		Dogs myDog = Dogs.shepherd;
		switch (myDog) {
		case collie:
			System.out.print("collie ");
			//case default: 		//won't compile here cause it's case default, it should be just default
			System.out.print("retriever ");
		case harrier:
			System.out.print("harrier ");
		}
	}
}
