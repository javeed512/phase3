package com.simplilearn.ems.service;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.simplilearn.ems.entity.Employee;
import com.simplilearn.ems.repository.EmployeeRepository;


@Service
public class EmployeeServiceImpl  implements IEmployeeService{

		@Autowired
		EmployeeRepository repo;
	
	
	@Override
	public Employee addEmployee(Employee employee) {
		// TODO Auto-generated method stub
		return repo.save(employee);
	}

}
