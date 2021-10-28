package com.wj.oa.organ.service;

import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.test.context.ContextConfiguration;
import org.springframework.test.context.junit4.SpringJUnit4ClassRunner;

import com.wj.oa.organ.model.Employee;
import com.wj.oa.organ.service.impl.EmployeeServiceImpl;

@ContextConfiguration("classpath:application-organ.xml")
@RunWith(SpringJUnit4ClassRunner.class)
public class EmployeeServiceTest {
	
	@Autowired
	EmployeeService employeeService;
	
	@Test
	public void testEmployeeService() {
		Employee employee = new Employee();
		employee.setName("李四");
		employee.setAge(22);
		employeeService.add(employee);
	}

}
