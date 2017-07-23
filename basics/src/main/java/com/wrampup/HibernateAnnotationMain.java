package com.wrampup;

import org.hibernate.Session;
import org.hibernate.SessionFactory;

import com.wrampup.config.HibernateUtil;
import com.wrampup.model.Employee1;

public class HibernateAnnotationMain {

	public static void main(String[] args) {
		Employee1 emp = new Employee1();
		emp.setName("David");
		emp.setRole("Developer");

		// Get Session
		SessionFactory sessionFactory = HibernateUtil.getSessionAnnotationFactory();
		Session session = sessionFactory.getCurrentSession();
		// start transaction
		session.beginTransaction();
		// Save the Model object
		session.save(emp);
		// Commit transaction
		session.getTransaction().commit();
		System.out.println("Employee ID=" + emp.getId());

		// terminate session factory, otherwise program won't end
		sessionFactory.close();
	}

}