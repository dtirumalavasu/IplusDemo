package com.toyota.dao;

import java.util.ArrayList;

import org.springframework.stereotype.Service;

import com.toyota.model.Customer;

@Service
public interface CustomerDao {

	public boolean doRegister(Customer customer);

	public Customer doLogin(Customer customer);

	public ArrayList<Customer> getCustomers();

	public Customer editCustomer(String customerName);

	public Customer updateCustomer(Customer customer);

	public Customer searchCustomer(String customer);

	public Customer getCustomerById(int customerId);

}
