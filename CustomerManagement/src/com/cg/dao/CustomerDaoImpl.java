package com.cg.dao;

import javax.persistence.EntityManager;
import javax.persistence.PersistenceContext;

import org.springframework.stereotype.Repository;

import com.cg.model.CustomerBean;

@Repository
public class CustomerDaoImpl implements ICustomerDao{

	@PersistenceContext
	private EntityManager entityManager;
	
	public CustomerBean addDetails(CustomerBean cust){
		
		entityManager.persist(cust);
		entityManager.flush();
		
		return cust;
		
		
	}
}
