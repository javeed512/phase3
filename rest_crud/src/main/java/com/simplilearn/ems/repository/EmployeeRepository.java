package com.simplilearn.ems.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.simplilearn.ems.entity.Employee;

@Repository
public interface EmployeeRepository  extends JpaRepository<Employee, Integer> {

}


//CrudRepository
//JpaRespository