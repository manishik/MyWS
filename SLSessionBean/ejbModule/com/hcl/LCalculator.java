package com.hcl;

import javax.ejb.Local;

@Local
public interface LCalculator 
{
	public int add(int a,int b);
}
