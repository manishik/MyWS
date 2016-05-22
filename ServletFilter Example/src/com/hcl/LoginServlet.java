package com.hcl;

import java.io.IOException;

import javax.servlet.RequestDispatcher;
import javax.servlet.ServletContext;
import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import org.apache.log4j.Logger;

public class LoginServlet extends HttpServlet {
	
	private static final long serialVersionUID = 1L;
	
	static Logger log = Logger.getLogger(MyFilter.class);

	private String target = "/result.jsp";

	public void init() throws ServletException {
		log.info("Inside Servlet's init()......");
	}

	public void doGet(HttpServletRequest request, HttpServletResponse response)
			throws ServletException, IOException {
		doPost(request, response);
	}

	public void doPost(HttpServletRequest request, HttpServletResponse response)
			throws ServletException, IOException {
		
		log.info("Inside Servlet's doPost().....");
		
		String userName = request.getParameter("uname");
		String password = request.getParameter("pwd");
		
		log.info("User Name in Servlet = " +userName);
		log.info("Password in Servlet = " +password);
		
		request.setAttribute("Attr1", userName);
				
		ServletContext context = getServletContext();

		RequestDispatcher dispatcher = context.getRequestDispatcher(target);
		dispatcher.forward(request, response);
	}
	public void destroy(){
		log.info("Inside Servlet's destroy().....");
	}
}