package com.genuitec.hibernate;

import org.hibernate.Session;


/**
 * Data access object (DAO) for domain model
 * @author MyEclipse - Hibernate Tools
 */
public class BaseHibernateDAO implements IBaseHibernateDAO {
	
	public Session getSession() {
		return HibernateSessionFactory.getSession();
	}
	
}