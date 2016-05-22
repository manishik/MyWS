package com.learning.Collection.Set.HashSet;

import java.util.*;

public class C1 {
	
	enum Example {one, two, three}
	
	public static void main(String[] args) {
		
		Collection coll = new ArrayList();
		coll.add(Example.one);
		coll.add(Example.one);
		coll.add(Example.one);
		coll.add(Example.two);
		coll.add(Example.two);
		coll.add(Example.three);
		
		System.out.println("Collection = "+coll);
		
		Set set = new HashSet(coll);
		
		System.out.println("Size of HashSet = "+set.size());
		
		Iterator i1 = set.iterator();
		while(i1.hasNext()){
			Example h1 = (Example)i1.next();
			System.out.println("Enum = "+h1);
		}
		
		List list = new ArrayList();
		list.add(Example.one);
		list.add(Example.one);
		list.add(Example.one);
		list.add(Example.two);
		list.add(Example.two);
		list.add(Example.three);
		
		System.out.println("List Size = "+list.size());
		
		Set set1 = new HashSet(list);
		
		System.out.println("Set Size = "+set1.size());
		
		Iterator i2 = set1.iterator();
		while(i2.hasNext()){
			Example h2 = (Example)i2.next();
			System.out.println("Enum 1 = "+h2);
		}
	}

}
