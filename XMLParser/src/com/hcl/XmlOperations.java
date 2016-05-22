package com.hcl;

import java.util.List;

import javax.naming.InitialContext;
import javax.persistence.EntityManager;
import javax.persistence.EntityManagerFactory;
import javax.persistence.Persistence;

import com.hcl.model.WorkFlow;

public class XmlOperations {

	/*@PersistenceContext(unitName = "CodeInspec")
	private EntityManager em;*/
	
	EntityManagerFactory emf = Persistence.createEntityManagerFactory("CodeInspec");
	EntityManager em = emf.createEntityManager(); 	
	
	WorkFlow workFlow;

	ParseXML parseXML = new ParseXML("file.xml");
	
	public static void main(String[] args) throws Exception{
		new XmlOperations().aMethod();
	}

	void getData() {
		List<WorkFlow> list = parseXML.returnData();
		for (WorkFlow workFlow : list) {
			System.out.println(workFlow.getDesc());
		}
	}

	void aMethod()  throws Exception {
		System.setProperty("java.naming.provider.url",
				"jnp://localhost:1099");
		System.setProperty("java.naming.factory.initial",
				"org.jnp.interfaces.NamingContextFactory");
		//InitialContext ctx = new InitialContext();
		
		List<WorkFlow> list = parseXML.returnData();
		for (WorkFlow workFlow : list) {
			System.out.println(workFlow.getDesc());
			try {
				em.getTransaction().begin();
				em.persist(workFlow);
				em.getTransaction().commit();
				em.close();
			} catch (Exception exception) {
				exception.printStackTrace();
			}
		}
	}
	
}
