package com.hcl;

import javax.interceptor.AroundInvoke;
import javax.interceptor.InvocationContext;

public class LogInterceptorTest {

	@AroundInvoke
	public Object log(InvocationContext ic) throws Exception {
		System.out.println("method name :: " + ic.getMethod());
		System.out.println("parameters :: " + ic.getParameters());
		System.out.println("Target :: " + ic.getTarget());
		Object obj = ic.proceed();
		System.out.println("after method :: " + ic.getMethod());
		return obj;
	}

}
