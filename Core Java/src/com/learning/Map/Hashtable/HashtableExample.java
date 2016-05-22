package com.learning.Map.Hashtable;

import java.util.Collection;
import java.util.Enumeration;
import java.util.Hashtable;
import java.util.Iterator;
import java.util.Set;

public class HashtableExample {

	public static void main(String[] args) {
		
		Hashtable<String, String> hashTable = new Hashtable<String, String>();
	    hashTable.put("1", "One");
	    hashTable.put("2", "Two");
	    hashTable.put("3", "Three");
	    
		//Check if a particular key exists in Java Hashtable
	    System.out.println("2 exists in Hashtable ? : " + hashTable.containsKey("2"));
		
	    //Check if a particular value exists in Java Hashtable
	    System.out.println("Two exists in Hashtable ? : " + hashTable.contains("Two"));
	    
	    //Get Set view of Keys from Java Hashtable
	    Set set = hashTable.keySet();

	    System.out.println("Keys = "+set);
	   /* Iterator itr1 = set.iterator();

	    while (itr1.hasNext()){
	      System.out.println(itr1.next());
	    }*/
	    set.remove("2");
	    
	    //Get Collection of Values from Java Hashtable
	    Collection<String> collection = hashTable.values();
	    Iterator<String> iterator = collection.iterator();
	    while (iterator.hasNext()){
	      System.out.println(iterator.next());
	    }
	    collection.remove("One");

	    Enumeration enumeration = hashTable.elements();

	    while (enumeration.hasMoreElements()){
	      System.out.println(enumeration.nextElement());
	    }
	    
	    Enumeration e1 = hashTable.keys();
	    while (e1.hasMoreElements()){
	      System.out.println(e1.nextElement());      
	    }

		hashTable.clear(); //Remove all values from Java Hashtable
		System.out.println("Size = " + hashTable.size());
	  
	    
	}

}
