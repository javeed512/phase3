package com.simplilearn.ems.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;

import com.simplilearn.ems.entity.Employee;
import com.simplilearn.ems.service.IEmployeeService;

@RestController
public class EmployeeController {
	
		@Autowired
		IEmployeeService service;
	
		@RequestMapping(value = "/add",method = RequestMethod.POST)
		public  Employee  addEmployee(@RequestBody Employee employee) {
			
			return 	service.addEmployee(employee);
			
			
		}
	
	

}
