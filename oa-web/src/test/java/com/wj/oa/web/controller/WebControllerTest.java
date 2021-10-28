package com.wj.oa.web.controller;

import static org.junit.Assert.assertEquals;

import javax.annotation.Resource;

import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.test.context.ContextConfiguration;
import org.springframework.test.context.junit4.SpringJUnit4ClassRunner;
import org.springframework.test.context.web.WebAppConfiguration;

import com.wj.oa.auth.model.UserRoleInfo;
import com.wj.oa.organ.model.Employee;

@RunWith(SpringJUnit4ClassRunner.class)
@WebAppConfiguration  
@ContextConfiguration(locations = {"classpath:application-web.xml", "classpath:spring-servlet.xml"})
public class WebControllerTest {
	
	@Resource
	private WebController webController;
	
	@Test
	public void testAddEmployee() {
		Employee employee = new Employee();
		employee.setName("赵六");  
		employee.setAge(45); 
		
		String result = webController.addEmployee(employee);
	
		assertEquals("ok", result); 
	}
	
	@Test
	public void testAuthorize() {
		UserRoleInfo auth = new UserRoleInfo();
		auth.setEmployeeId(5L); 
		auth.setRoleId(8L); 
		
		String result = webController.authorize(auth);
		
		assertEquals("ok", result);  
	}
	

}
