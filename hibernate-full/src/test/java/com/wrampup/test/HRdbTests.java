package com.wrampup.test;

import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.test.context.ActiveProfiles;
import org.springframework.test.context.junit4.SpringRunner;

import com.wrampup.dao.HRDao;

@RunWith(SpringRunner.class)
@SpringBootTest
@ActiveProfiles("mysql")
public class HRdbTests {

	@Autowired
	private HRDao dao;

	// @Test
	// public void getAllEmpTest() {
	// List<Employee> employees = dao.getAllEmployees();
	// System.out.println(employees);
	// Assert.assertTrue(employees.size() == 107);
	// }
	//
	// @Test
	// public void getAllEmpDTOTest() {
	// List<EmployeeDTO> employees = dao.getEmployeeDTO();
	// System.out.println(employees);
	// Assert.assertTrue(employees.size() == 107);
	// }
}
