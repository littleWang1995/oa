package com.wj.oa.web.controller;

import com.wj.oa.auth.model.UserRoleInfo;
import com.wj.oa.auth.service.UserRoleInfoService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;

import com.wj.oa.organ.model.Employee;
import com.wj.oa.organ.service.EmployeeService;

@Controller
public class WebController {

	@Autowired
	private EmployeeService employeeService;
	@Autowired
	private UserRoleInfoService userRoleInfoService;

	@RequestMapping("/addEmployee")
	@ResponseBody
	public String addEmployee(Employee employee) {
		try {
			employeeService.add(employee);
		} catch (Exception e) {
			e.printStackTrace(); 
			return "error";
		}
		return "ok";
	}
	
	@RequestMapping("/authorize")
	@ResponseBody
	public String authorize(UserRoleInfo userRoleInfo) {
		try {
			userRoleInfoService.addRoleInfo(userRoleInfo);
		} catch (Exception e) {
			e.printStackTrace(); 
			return "error";
		}
		return "ok";
	}
	
}
