package com.learning;

import javax.ejb.Local;

@Local
public interface IMD {

	public int multiply(int x, int y);
	
	public int divide();
	
}
