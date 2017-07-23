package com.wrampup.dao;

import org.junit.Assert;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.test.context.ActiveProfiles;
import org.springframework.test.context.junit4.SpringRunner;

import com.wrampup.model.Employee1;

@RunWith(SpringRunner.class)
@SpringBootTest
@ActiveProfiles("test")
public class BasicTest {

	@Autowired
	private BasicDao basicDao;

	@Test
	public void testConf() {
		Assert.assertTrue(basicDao.testDao());
	}

	@Test
	public void createTest() {
		Employee1 employee = new Employee1();
		employee.setName("TestName");
		employee.setRole("TestRole");
		employee = basicDao.createEmp(employee);
		System.err.println(employee);
	}

}
