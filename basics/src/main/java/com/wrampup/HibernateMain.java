package com.wrampup;

import org.hibernate.Session;

import com.wrampup.config.HibernateUtil;
import com.wrampup.model.Employee;

public class HibernateMain {

	public static void main(String[] args) {
		Employee emp = new Employee();
		emp.setName("Pankaj");
		emp.setRole("CEO");

		// Get Session
		Session session = HibernateUtil.getSessionFactory().getCurrentSession();
		// start transaction
		session.beginTransaction();
		// Save the Model object
		session.save(emp);
		// Commit transaction
		session.getTransaction().commit();
		System.out.println("Employee ID=" + emp.getId());

		// terminate session factory, otherwise program won't end
		HibernateUtil.getSessionFactory().close();
	}

}