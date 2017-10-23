package com.cg.service;

import javax.transaction.Transactional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.cg.dao.CustomerDaoImpl;
import com.cg.model.CustomerBean;


@Service
@Transactional
public class CustomerServiceImpl implements ICustomerService{

	@Autowired
	private CustomerDaoImpl customerDao;
	
	@Override
	public CustomerBean addDetails(CustomerBean cust) {
		return customerDao.addDetails(cust);
	}
}
