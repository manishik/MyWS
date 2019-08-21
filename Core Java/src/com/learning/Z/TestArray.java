package com.learning.Z;

import java.util.ArrayList;
import java.util.Date;
import java.util.List;

public class TestArray {

	public static void main(String[] args) {

		Dumm dumm = new Dumm();
		dumm.setDob(new Date());
		dumm.setFname("F");
		dumm.setLname("L");

		Dumm dumm2 = new Dumm();
		dumm2.setDob(new Date());
		dumm2.setFname("F1");
		dumm2.setLname("L1");

		List<Dumm> list1 = new ArrayList<Dumm>();
		list1.add(dumm);
		list1.add(dumm2);

		//List<Dumm> list2 = new ArrayList<Dumm>(list1.size());
		
		for (Dumm dummC1 : list1) {
			System.out.println("FName Earlier = " + dummC1.getFname()); 
		}

		//Changing
		for (Dumm dummC1 : list1) {
			dummC1.setFname("Prav"); //Format issue 
		}
		
		for (Dumm dummC1 : list1) {
			System.out.println("FN : " + dummC1.getFname()); 
			System.out.println("LN : " + dummC1.getLname());
		}
		
		
		//System.out.println("L2 size = " + list2.size());
		//list2.addAll(0, list1);
		//System.out.println(list2.size());

	}

}

class Dumm {

	private String fname;
	private String lname;
	private Date dob;

	public String getFname() {
		return fname;
	}

	public void setFname(String fname) {
		this.fname = fname;
	}

	public String getLname() {
		return lname;
	}

	public void setLname(String lname) {
		this.lname = lname;
	}

	public Date getDob() {
		return dob;
	}

	public void setDob(Date dob) {
		this.dob = dob;
	}
}