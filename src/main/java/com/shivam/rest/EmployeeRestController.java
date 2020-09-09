package com.shivam.rest;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.shivam.Entity.Employee;
import com.shivam.dao.EmployeeDAO;

@RestController
@RequestMapping("/api")
public class EmployeeRestController {
	
	@Autowired
	private EmployeeDAO employeeDao;

	
	@GetMapping("/employees")
	public List<Employee> getAllEmployees(){
		return employeeDao.findAll();
	}
	
}
