package com.hcl;

import javax.ejb.Stateless;
import javax.interceptor.Interceptors;

@Stateless (name="interception") 
@Interceptors(TestInterceptor.class)
public class SLInterceptedBean implements IRemote,ILocal {

	public int multiplier(int i , int z){
		return (i*z);
	}
	
}
