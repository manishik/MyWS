package com.learning.StringBuilder;

public class T1 {

	public static void main(String[] args) {
		
		StringBuilder sb = new StringBuilder("Manish");
		sb.append("\n");
		sb.append("Indudhar");
		sb.append("Indudhar");
		sb.append("Indudhar");
		System.out.println(sb);
		System.out.println("------------");
		System.out.println("Creating a new sb");
		sb = new StringBuilder();
		System.gc();
		sb.append("M");
		sb.append("I");
		System.out.println(sb);
	}

}
