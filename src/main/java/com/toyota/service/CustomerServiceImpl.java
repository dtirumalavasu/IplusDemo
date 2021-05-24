package com.toyota.service;

import java.util.ArrayList;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import com.toyota.dao.CustomerDao;
import com.toyota.model.Customer;

@Service
@Transactional
public class CustomerServiceImpl implements CustomerService {
	@Autowired
	public CustomerDao customerDao;

	@Override
	public boolean doRegister(Customer customer) {
		return customerDao.doRegister(customer);
	}

	@Override
	public Customer doLogin(Customer customer) {
		System.out.println("++++++++++++++service"+customer);
		return customerDao.doLogin(customer);
	}

	@Override
	public ArrayList<Customer> getCustomers() {
		return customerDao.getCustomers();
	}

	@Override
	public Customer editCustomer(String customerName) {
		return customerDao.editCustomer(customerName);
	}

	@Override
	public Customer updateCustomer(Customer customer) {
		return customerDao.updateCustomer(customer);
	}

	@Override
	public Customer searchCustomer(String customer) {
		return customerDao.searchCustomer(customer);
	}

	@Override
	public Customer getCustomerById(int customerId) {

		return customerDao.getCustomerById(customerId);
	}

}
