package com.shivam.dao;

import java.util.List;

import javax.persistence.EntityManager;

import org.hibernate.Session;
import org.hibernate.query.Query;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Repository;
import org.springframework.transaction.annotation.Transactional;

import com.shivam.Entity.Employee;

@Repository
public class EmployeeDAOImpl_Hibernate implements EmployeeDAO{

	private EntityManager entityManager;
	
	@Autowired
	public EmployeeDAOImpl_Hibernate(EntityManager entityManager) {
		this.entityManager = entityManager;
	}
	
	@Transactional
	@Override
	public List<Employee> findAll() {
		Session session = entityManager.unwrap(Session.class);
		Query<Employee> query = session.createQuery("from Employee",Employee.class);
		List<Employee> list = query.getResultList();
		return list;
	}
	
}
