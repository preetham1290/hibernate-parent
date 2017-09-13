package com.wrampup.dao;

import org.hibernate.SessionFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Repository;

@Repository
public class CriteriaDao {

	@Autowired
	private SessionFactory sessionFactory;

	// try {
	// Session session = sessionFactory.openSession();
	// return null;
	// } catch (HibernateException e) {
	// e.printStackTrace();
	// throw e;
	// }

	// public List<Employee> getAllEmployees() {
	// try {
	// Session session = sessionFactory.openSession();
	// Criteria crit = session.createCriteria(Employee.class);
	// List<Employee> employees = crit.list();
	// return employees;
	// } catch (HibernateException e) {
	// e.printStackTrace();
	// throw e;
	// }
	// }
	//
	// public List<Employee> getEmployeesByDeptId(long id) {
	// try {
	// Session session = sessionFactory.openSession();
	// Criteria crit = session.createCriteria(Employee.class);
	// Criteria dept = crit.createCriteria("departmentId");
	// dept.add(Restrictions.eq("locationId", id));
	// List<Employee> employees = crit.list();
	// return employees;
	// } catch (HibernateException e) {
	// e.printStackTrace();
	// throw e;
	// }
	// }

}
