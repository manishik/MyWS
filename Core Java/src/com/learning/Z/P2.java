package com.learning.Z;

import java.util.ArrayList;

public class P2 {
	
	public static void main(String[] args) {
		ArrayList al = new ArrayList<String>();
		al.add("Manish");
		al.add("Indudhar");
		al.add(33);
		al.add(22);
		al.add(11);
		Class class1 = new Class(al);
		System.out.println(""+class1.getObject());
		
		Class<ArrayList> class2 = new Class();
		System.out.println(""+class2.getObject());
	}
}

class Class<ArrayList> {

	private ArrayList al;
	//private String s1 = new String("Manish"); //Cannot instantiate the type String if the 
												// class type is also of the same type

	public Class() {
	}
	
	public Class(ArrayList al) {
		this.al = al;
	}

	public ArrayList getObject() {
		return al;
	}

}