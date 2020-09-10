package com.shivam.dao;

import java.util.List;

import javax.persistence.EntityManager;
import javax.persistence.Query;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Repository;

import com.shivam.Entity.Employee;

@Repository
public class EmployeeDAOJpaImpl implements EmployeeDAO{

	private EntityManager entityManager;
	
	@Autowired
	public EmployeeDAOJpaImpl(EntityManager entityManager) {
		this.entityManager = entityManager;
	}
	
	@Override
	public List<Employee> findAll() {
		Query query = entityManager.createQuery("from Employee");
		List<Employee> list = query.getResultList();
		return list;
	}

	@Override
	public Employee findById(int id) {
		Employee emp = entityManager.find(Employee.class, id);
		return emp;
	}

	@Override
	public void save(Employee emp) {
		Employee tempEmp = entityManager.merge(emp);
		emp.setId(tempEmp.getId());
	}

	@Override
	public void deleteById(int id) {
		Query query = entityManager.createQuery("delete from Employee where id=:id");
		query.setParameter("id",id);
		query.executeUpdate();
	}

}
