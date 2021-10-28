package com.wj.oa.organ.service.impl;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.wj.oa.organ.mapper.EmployeeMapper;
import com.wj.oa.organ.model.Employee;
import com.wj.oa.organ.service.EmployeeService;

@Service("employeeService")
public class EmployeeServiceImpl implements EmployeeService{
	
	@Autowired
	EmployeeMapper employeeMapper;

	@Override
	public void add(Employee employee) {
		employeeMapper.addEmployee(employee);
	}

	@Override
	public Employee findById(Long id) {
		Employee findById = employeeMapper.findById(id);
		return findById;
	}

}
