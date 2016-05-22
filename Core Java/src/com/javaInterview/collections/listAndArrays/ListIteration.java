package com.javaInterview.collections.listAndArrays;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Iterator;
import java.util.List;

public class ListIteration {
	public static void main(String[] a) {

		//List of String
		List<String> strNums = new ArrayList<String>();
		strNums.add("One");
		strNums.add("Two");
		strNums.add("Three");
		strNums.add("Four");
		strNums.add("Four");//Duplicate
		strNums.add("Four");//Duplicate
		strNums.add("Five");

		//Iterate over the list in classic style
		for (int i = 0; i < strNums.size(); i++) {
			String string = (String) strNums.get(i);
			System.out.println("Classic Style = " + string);
		}
		
		//Iterate over the list in classic style to get the Fifth element
		String s1  = strNums.get(5); //No need to cast since list is generic by type
		System.out.println("Fifth element in List = "+s1);
		
		//Iterate over the list using Iterator
		String str;
		Iterator e = strNums.iterator();
		while (e.hasNext()) {
			str = (String) e.next();
			System.out.println("Iterator = " + str);
		}

		//Iterate over the list using new for loop
		for (String str2 : strNums) {
			System.out.println("the new for loop = " + str2);
		}

		//List which has objects 
		List<Colours> coloursList = new ArrayList<Colours>();
		Colours colours1 = new Colours();
		colours1.setName("Red");
		colours1.setId("1");

		Colours colours2 = new Colours();
		colours2.setName("Green");
		colours2.setId("2");

		Colours colours3 = new Colours();
		colours3.setName("Blue");
		colours3.setId("2");

		coloursList.add(colours3);
		coloursList.add(colours2);
		coloursList.add(colours1);
		Collections.sort(coloursList);

		//Iterate over the list using new for loop
		for (Colours colours : coloursList) {
			System.out.println("Colour Name : " + colours.getName());
			System.out.println("Colour Id : " + colours.getId());
		}
		
		System.out.println("Iterate over the list using Iterator");
		//Iterate over the list using Iterator
		Iterator<Colours> iter = coloursList.iterator();
		Colours iterColour;
		while (iter.hasNext()) {
			iterColour = iter.next(); 
			System.out.println("Iterator = " + iterColour.getName());
		}

	}
}

class Colours implements Comparable<Colours> {

	private String name;
	private String id;

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public String getId() {
		return id;
	}

	public void setId(String id) {
		this.id = id;
	}

	public int compareTo(Colours col) {
		return name.compareTo(col.name);
	}

	public boolean equals(Object o) {
		if ((o instanceof Colours)
				&& (((Colours) o).getId() == this.id)) {
			return true;
		} else {
			return false;
		}
	}

}
