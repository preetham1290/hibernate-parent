package com.wrampup.test;

import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.test.context.ActiveProfiles;
import org.springframework.test.context.junit4.SpringRunner;

import com.wrampup.dao.OneToOneDao;
import com.wrampup.model.Address;
import com.wrampup.model.Employee;

@RunWith(SpringRunner.class)
@SpringBootTest
@ActiveProfiles("test")
public class OneToOneTest {

	@Autowired
	private OneToOneDao dao;

	@Test
	public void createTest() {
		Employee employee = new Employee();

		employee.setName("TestName");
		employee.setDesignation("TestDesignnation");
		Address address = new Address();
		address.setAddress("test address");
		employee.setAddress(address);

		employee = dao.createEmp(employee);
		System.err.println(employee);
		
	}
}
