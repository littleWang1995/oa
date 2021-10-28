package com.wj.oa.organ.mapper;

import com.wj.oa.organ.model.Employee;

public interface EmployeeMapper {
	
	public void addEmployee(Employee employee);
	
	public Employee findById(Long id);

}
