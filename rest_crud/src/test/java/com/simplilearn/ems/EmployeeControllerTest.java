package com.simplilearn.ems;

import static org.junit.jupiter.api.Assertions.assertNotNull;

import org.junit.jupiter.api.BeforeAll;
import org.junit.jupiter.api.Test;
import org.junit.jupiter.params.ParameterizedTest;
import org.junit.jupiter.params.provider.ValueSource;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.SpringBootConfiguration;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.http.ResponseEntity;
import org.springframework.web.client.RestTemplate;

import com.simplilearn.ems.entity.Employee;


@SpringBootTest
class EmployeeControllerTest {
	
	
	@Autowired	
	RestTemplate restTemplate;
	

		
	
	@Test
	//@ParameterizedTest
	//@ValueSource(strings = {"2","4","11"})
	void testGetEmployeeById() {
		
	
			int id = 2;
		
	ResponseEntity<Employee> response =	restTemplate.getForEntity("http://localhost:8080/api/v1/employees/get/"+id, Employee.class);
		
			Employee emp =	response.getBody();
	
		assertNotNull(emp);
		
	}

	@Test
	void testGetAll() {
		
	}

	@Test
	void testGetBySalaryGT() {
		
	}

}
