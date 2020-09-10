package com.shivam.rest;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.shivam.Entity.Employee;
import com.shivam.service.EmployeeService;

@RestController
@RequestMapping("/api")
public class EmployeeRestController {
	
	@Autowired
	private EmployeeService employeeService;

	
	@GetMapping("/employees")
	public List<Employee> getAllEmployees(){
		return employeeService.findAll();
	}
	
	@GetMapping("/employees/{id}")
	public Employee getAllEmployee(@PathVariable("id") int id){
		Employee emp = employeeService.findById(id);
		return emp;
	}
	
	@PostMapping("/employees")
	public Employee saveEmployee(@RequestBody Employee emp){
		emp.setId(0);
		employeeService.save(emp);
		return emp;
	}
	
	@DeleteMapping("/employees/{id}")
	public String deleteEmployee(@PathVariable("id") int id){
		employeeService.deleteById(id);
		return "Employee deleted with ID "+id;
	}
	
	@PutMapping("/employees")
	public Employee updateEmployee(@RequestBody Employee emp){
		employeeService.save(emp);
		return emp;
	}
	
}
