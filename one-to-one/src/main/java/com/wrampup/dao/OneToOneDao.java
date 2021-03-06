package com.wrampup.dao;

import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.Transaction;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Repository;

import com.wrampup.model.Employee;

@Repository
public class OneToOneDao {

	@Autowired
	private SessionFactory sessionFactory;

	public boolean testDao() {
		return sessionFactory != null;
	}

	public Employee createEmp(Employee employee) {
		Session session = null;
		Transaction transaction = null;
		try {
			session = sessionFactory.openSession();
			transaction = session.beginTransaction();
			session.save(employee);
			transaction.commit();
			return employee;
		} catch (Exception exception) {
			exception.printStackTrace();
			throw exception;
		} finally {
			if (session != null) {
				session.close();
			}
		}

	}
}
