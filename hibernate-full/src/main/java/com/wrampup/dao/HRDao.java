package com.wrampup.dao;

import java.util.List;

import org.hibernate.HibernateException;
import org.hibernate.Query;
import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.transform.Transformers;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Repository;

import com.wrampup.dto.EmployeeDTO;
import com.wrampup.model.Employee;

@Repository
public class HRDao {

	@Autowired
	private SessionFactory sessionFactory;

	public List<Employee> getAllEmployees() {
		try {
			Session session = sessionFactory.openSession();
			Query query = session.createQuery("from Employee");
			// query.setResultTransformer(Transformers.aliasToBean(Employee.class));
			List<Employee> employees = query.list();
			return employees;
		} catch (HibernateException e) {
			e.printStackTrace();
			throw e;
		}
	}

	public List<EmployeeDTO> getEmployeeDTO() {
		try {
			Session session = sessionFactory.openSession();
			Query query = session.createQuery("select firstName as firstName, email as email from Employee");
			query.setResultTransformer(Transformers.aliasToBean(EmployeeDTO.class));
			List<EmployeeDTO> employees = query.list();
			return employees;
		} catch (HibernateException e) {
			e.printStackTrace();
			throw e;
		}
	}

}
