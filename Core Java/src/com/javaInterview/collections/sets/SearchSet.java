package com.javaInterview.collections.sets;

import java.util.HashSet;
import java.util.Iterator;
import java.util.Set;

public class SearchSet {

	public static void main(String[] args) {

		Set<Emp> hashSet = new HashSet<Emp>();
		
		Emp emp = new Emp();
		emp.setId(0);
		emp.setName("Manish");
		emp.setDeptId(0);
		
		Emp emp1 = new Emp();
		emp1.setId(1);
		emp1.setName("Indudhar");
		emp1.setDeptId(1);
		
		Emp emp2 = new Emp();
		emp2.setId(2);
		emp2.setName("Keshav");
		emp2.setDeptId(2);
		
		Emp emp3 = new Emp();
		emp3.setId(3);
		emp3.setName("Hero");
		emp3.setDeptId(4);
		
		hashSet.add(emp);
		hashSet.add(emp1);
		hashSet.add(emp2);
		//hashSet.add(emp3);
		
		/*for(Emp em: hashSet){
			System.out.println(em);
		}*/
		
		int idToBeSearched = 2;
		String nameToBeSearched = "Keshav";
		
		for (Iterator iterator = hashSet.iterator(); iterator.hasNext();) {
			Emp e = (Emp) iterator.next();
			if(idToBeSearched == e.getId() && nameToBeSearched.equalsIgnoreCase(e.getName())){
				System.out.println("Got it : " + e);
			}
		}
		
		/*Iterator iter = hashSet.iterator();
		while (iter.hasNext()) {
			System.out.println(iter.next());
		}*/
	}

}
