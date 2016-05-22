package com.learning.scjpDumpPdfExamples;

import java.util.ArrayList;
import java.util.List;

public class Q6 {
	
	public static void main(String[] args) {

	}

	public void takeList(List<? extends String> list){
		//list.add("foo"); //Compilation Fails
		list = new ArrayList<String>();
		//list = new ArrayList<Object>(); //Compilation Fails
		String s = list.get(0);
		Object o = list;
		
		Object o1 = list.get(0);
		list.add(null);
	}
	
}
