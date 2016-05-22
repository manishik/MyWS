package com.hcl;

import javax.ejb.Remote;

@Remote public interface SFCalc {
	
	public int add(int a, int b);

	public int sub();
	
	//public int Mul(int s, int p);
	
	//public int Div();
	
}
