package com.hcl;

import javax.ejb.Remote;

@Remote public interface Calculator 
{
 public int add(int a,int b);
}
