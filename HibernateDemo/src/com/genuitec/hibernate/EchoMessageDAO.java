package com.genuitec.hibernate;

import java.util.List;
import org.apache.commons.logging.Log;
import org.apache.commons.logging.LogFactory;
import org.hibernate.LockMode;
import org.hibernate.Query;
import org.hibernate.criterion.Example;

/**
 * Data access object (DAO) for domain model class EchoMessage.
 * @see com.genuitec.hibernate.EchoMessage
 * @author MyEclipse - Hibernate Tools
 */
public class EchoMessageDAO extends BaseHibernateDAO {

    private static final Log log = LogFactory.getLog(EchoMessageDAO.class);

	//property constants
	public static final String MSG = "msg";

    
    public void save(EchoMessage transientInstance) {
        log.debug("saving EchoMessage instance");
        try {
            getSession().save(transientInstance);
            log.debug("save successful");
        } catch (RuntimeException re) {
            log.error("save failed", re);
            throw re;
        }
    }
    
	public void delete(EchoMessage persistentInstance) {
        log.debug("deleting EchoMessage instance");
        try {
            getSession().delete(persistentInstance);
            log.debug("delete successful");
        } catch (RuntimeException re) {
            log.error("delete failed", re);
            throw re;
        }
    }
    
    public EchoMessage findById(java.lang.Integer id) {
        log.debug("getting EchoMessage instance with id: " + id);
        try {
            EchoMessage instance = (EchoMessage) getSession()
                    .get("com.genuitec.hibernate.EchoMessage", id);
            return instance;
        } catch (RuntimeException re) {
            log.error("get failed", re);
            throw re;
        }
    }
    
    
    public List findByExample(EchoMessage instance) {
        log.debug("finding EchoMessage instance by example");
        try {
            List results = getSession()
                    .createCriteria("com.genuitec.hibernate.EchoMessage")
                    .add(Example.create(instance))
            .list();
            log.debug("find by example successful, result size: " + results.size());
            return results;
        } catch (RuntimeException re) {
            log.error("find by example failed", re);
            throw re;
        }
    }    
    
    public List findByProperty(String propertyName, Object value) {
      log.debug("finding EchoMessage instance with property: " + propertyName
            + ", value: " + value);
      try {
         String queryString = "from EchoMessage as model where model." 
         						+ propertyName + "= ?";
         Query queryObject = getSession().createQuery(queryString);
		 queryObject.setParameter(0, value);
		 return queryObject.list();
      } catch (RuntimeException re) {
         log.error("find by property name failed", re);
         throw re;
      }
	}

	public List findByMsg(Object msg) {
		return findByProperty(MSG, msg);
	}
	
    public EchoMessage merge(EchoMessage detachedInstance) {
        log.debug("merging EchoMessage instance");
        try {
            EchoMessage result = (EchoMessage) getSession()
                    .merge(detachedInstance);
            log.debug("merge successful");
            return result;
        } catch (RuntimeException re) {
            log.error("merge failed", re);
            throw re;
        }
    }

    public void attachDirty(EchoMessage instance) {
        log.debug("attaching dirty EchoMessage instance");
        try {
            getSession().saveOrUpdate(instance);
            log.debug("attach successful");
        } catch (RuntimeException re) {
            log.error("attach failed", re);
            throw re;
        }
    }
    
    public void attachClean(EchoMessage instance) {
        log.debug("attaching clean EchoMessage instance");
        try {
            getSession().lock(instance, LockMode.NONE);
            log.debug("attach successful");
        } catch (RuntimeException re) {
            log.error("attach failed", re);
            throw re;
        }
    }
}