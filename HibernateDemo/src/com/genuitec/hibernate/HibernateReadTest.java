package com.genuitec.hibernate;

import org.hibernate.HibernateException;

public class HibernateReadTest {
	 public static void main(String[] args) {
		EchoMessageDAO echoMessageDAO = new EchoMessageDAO();
		try {
			EchoMessage echoMessage = echoMessageDAO.findById(new Integer(2));
			System.out.println("Entity Retrival successfully ,Message is :"+echoMessage.getMsg());
			
			
		} catch (HibernateException e) {
			System.out.println("Entity Retrival Failed.");
			e.printStackTrace();
		}
		finally{
			try {
				echoMessageDAO.getSession().close();
			} catch (Exception e) {
				// TODO: handle exception
			}
		}
		
	}

}
