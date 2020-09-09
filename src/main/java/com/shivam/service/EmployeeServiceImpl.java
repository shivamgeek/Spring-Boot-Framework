package com.shivam.service;

import java.util.List;

import javax.transaction.Transactional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.shivam.Entity.Employee;
import com.shivam.dao.EmployeeDAO;

@Service
public class EmployeeServiceImpl implements EmployeeService{
	
	@Autowired
	private EmployeeDAO employeeDao;
	
	@Override
	@Transactional
	public List<Employee> findAll() {
		return employeeDao.findAll();
	}

	@Override
	@Transactional
	public Employee findById(int id) {
		return employeeDao.findById(id);
	}

	@Override
	@Transactional
	public void save(Employee emp) {
		employeeDao.save(emp);
	}

	@Override
	@Transactional
	public void deleteById(int id) {
		employeeDao.deleteById(id);
	}

}
