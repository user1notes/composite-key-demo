package com.config;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class EmployeeService {

	@Autowired
	EmployeeRepository repository;
	
	void saveEmployee(Employee employee) {
		repository.save(employee);
	}
}
