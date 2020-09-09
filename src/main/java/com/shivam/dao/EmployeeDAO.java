package com.shivam.dao;

import com.shivam.Entity.Employee;

import java.util.List;

public interface EmployeeDAO {

	public List<Employee> findAll();
	
	public Employee findById(int id);
	
	public void save(Employee emp);
	
	public void deleteById(int id);
	
}
