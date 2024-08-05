package com.securends.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.securends.entity.Employee;
import com.securends.repository.EmployeeRepository;

@RestController
@RequestMapping("/employee")
public class EmployeeController {
	
	@Autowired
	private EmployeeRepository employeeRepository;
	
	@PostMapping("/save")
	public Employee saveEmployee(@RequestBody Employee employee){
		System.out.println("Hi");
		return employeeRepository.save(employee);
		
	}
	
	@GetMapping("/get")
	public List<Employee> fetchEmployees() {
		  
		return employeeRepository.fetchEmployees();
		
	}
}
