package com.hcl;

import javax.interceptor.AroundInvoke;
import javax.interceptor.InvocationContext;

public class TestInterceptor {

	@AroundInvoke
	public Object SomeMethod(InvocationContext ctx) throws Exception{
		
		System.out.println(ctx.getClass()+" - "+ctx.getMethod()+" - "+ctx.getParameters());
		System.out.println("Before Interceptor");
		Object obj = ctx.proceed();
		System.out.println("After Interceptor");
		return obj;
	}
	
}
