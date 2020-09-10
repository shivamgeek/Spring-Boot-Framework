package com.shivam.dao;

import org.springframework.data.jpa.repository.JpaRepository;

import com.shivam.Entity.Employee;

public interface EmployeeRepository extends JpaRepository<Employee,Integer>{
	
	/*
	 * 1. No Implementation for DAO is required as JpaRepository by default provides implementation
	 * 2. JpaRepository<DAO Type, Primary key type>
	 * 3. No need for @Repository annotation
	 * 4. Update Service Impl code to now use EmployeeRepository instead of DaoImpl
	 * 5. No need for @Transactional in Service as JpaRepository takes care of that
	 */
	
	
}
