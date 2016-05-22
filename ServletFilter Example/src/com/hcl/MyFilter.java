package com.hcl;

import java.io.IOException;

import javax.servlet.Filter;
import javax.servlet.FilterChain;
import javax.servlet.FilterConfig;
import javax.servlet.ServletException;
import javax.servlet.ServletRequest;
import javax.servlet.ServletResponse;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import org.apache.log4j.Logger;

public class MyFilter implements Filter { 
	
	static Logger log = Logger.getLogger(MyFilter.class.getName());
	
	public FilterConfig filterConfig;

	ValueObject contact = new ValueObject();
	
	public void init(FilterConfig filterConfig) throws ServletException {
		this.filterConfig = filterConfig;
		log.info("Inside Filter's init()......");
	} 

	public void doFilter(ServletRequest request, ServletResponse response,
			FilterChain chain) {
		
		log.info("Inside Filter's doFilter()......");

		HttpServletRequest Httpreq = (HttpServletRequest) request;
		HttpServletResponse Httpres = (HttpServletResponse) response;

		try {
			log.info("Within My Filter .....");
			log.info("Filtering the Request ....");
			
			//Getting username and password from the JSP
			String username = Httpreq.getParameter("uname");
			String password = Httpreq.getParameter("pwd");

			log.info("User Name = " + username);
			log.info("Password = " + password);

			//Setting the username and password to transfer objects
			contact.setUsername(username);
			contact.setPassword(password);
			
			chain.doFilter(Httpreq, Httpres);

			log.info("Within My Filter .....");
			log.info("Filtering the Response ...");
			
		} catch (IOException io) {
			log.info("IOException raised in MyFilter");
		} catch (ServletException se) {
			log.info("ServletException raised in MyFilter");
		}
	}

	public void destroy() {
		log.info("Inside Filter destroy()......");
	}
}
