package com.wrampup.test;

import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.test.context.ActiveProfiles;
import org.springframework.test.context.junit4.SpringRunner;

import com.wrampup.dao.CriteriaDao;

@RunWith(SpringRunner.class)
@SpringBootTest
@ActiveProfiles("mysql")
public class CriteriaTest {

	@Autowired
	private CriteriaDao dao;

//	@Test
//	public void getAllEmpTest() {
//		List<Employee> employees = dao.getAllEmployees();
//		System.out.println(employees);
//		Assert.assertTrue(employees.get(0).getEmployeeId() == 101);
//	}
//
//	@Test
//	public void getEmployeesByDeptId() {
//		List<Employee> employees = dao.getEmployeesByDeptId(1700);
//		System.out.println(employees.size());
//		Assert.assertTrue(employees.size() == 18);
//	}
}
