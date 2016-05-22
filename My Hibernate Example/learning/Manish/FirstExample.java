package learning.Manish;

import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.Transaction;
import org.hibernate.cfg.Configuration;

public class FirstExample {
	public static void main(String[] args) {
		Session session = null;
		try {
			// This step will read hibernate.cfg.xml and prepare hibernate for use
			SessionFactory sessionFactory = new Configuration().configure().buildSessionFactory();
			session = sessionFactory.openSession();
			Transaction tx = session.beginTransaction();
			// Create new instance of Contact and set values in it by reading them from object
			System.out.println("Record being inserted or deleted or updated");
			Contact contact = new Contact();
			contact.setFirstName("Manish");
			contact.setLastName("Indudhar");
			contact.setEmail("manish@yahoo.com");
			contact.setId(2);
			session.save(contact);// for adding new record
			// session.delete(contact);//for deleting a record
			//session.update(contact);// for updating a existing record
			tx.commit();
			System.out.println("Done");
		} catch (Exception e) {
			e.printStackTrace();
			System.out.println(e.getMessage());
		} finally {
			// Actual contact insertion will happen at this step
			session.flush();
			session.close();
		}
	}
}
