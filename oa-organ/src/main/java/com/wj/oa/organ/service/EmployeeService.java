package com.wj.oa.organ.service;

import com.wj.oa.organ.model.Employee;

public interface EmployeeService {
	
	void add(Employee employee);
	
	Employee findById(Long id);

}
