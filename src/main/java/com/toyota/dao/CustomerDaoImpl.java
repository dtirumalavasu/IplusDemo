package com.toyota.dao;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;

import org.hibernate.Criteria;
import org.hibernate.SessionFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Repository;
import com.toyota.model.Customer;

@Repository
public class CustomerDaoImpl implements CustomerDao {

	@Autowired
	public SessionFactory sessionFactory;

	public SessionFactory getSessionFactory() {
		return sessionFactory;
	}

	public void setSessionFactory(SessionFactory sessionFactory) {
		this.sessionFactory = sessionFactory;
	}

	@Override
	public boolean doRegister(Customer customer) {
		System.out.println("---------------" + customer);
		String qry = "from Customer c where c.customerEmail = :email";
		System.out.println(qry);
		List list = sessionFactory.getCurrentSession().createQuery(qry)
				.setParameter("email", customer.getCustomerEmail()).list();

		if (!list.isEmpty()) {
			return false;
		} else {
			sessionFactory.getCurrentSession().save(customer);
		}
		return true;
	}

	@Override
	public Customer doLogin(Customer customer) {
		System.out.println("---------------" + customer);
		Criteria criteria=	sessionFactory.getCurrentSession().createCriteria(Customer.class);
		List employees = criteria.list();

		Iterator itr = employees.iterator();
		while (itr.hasNext()) {

			Customer c = (Customer) itr.next();
			System.out.println("table date is**************"+c);
		
		if (c != null) {
			if (c.getCustomerName().equalsIgnoreCase(customer.getCustomerName())
					&& c.getCustomerPassword().equalsIgnoreCase(customer.getCustomerPassword())) {
				System.out.println("$$$$$$$$$$$$$returnDao"+c);
				return c;
			
			} else {
				return null;
			}
		} else {
			return null;
		}
		}
		return customer;
	
	}

	@Override
	public ArrayList<Customer> getCustomers() {
		return (ArrayList<Customer>) sessionFactory.getCurrentSession().createQuery("from Customer").list();
	}

	@Override
	public Customer updateCustomer(Customer customer) {
		sessionFactory.getCurrentSession().saveOrUpdate(customer);
		Customer c = sessionFactory.getCurrentSession().get(Customer.class, customer.getCustomerName());
		if (c != null) {
			return c;
		} else {
			return null;
		}
	}

	@Override
	public Customer searchCustomer(String customerName) {
		return (Customer) sessionFactory.getCurrentSession().get(Customer.class, customerName);

	}

	@Override
	public Customer editCustomer(String customerName) {

		return (Customer) sessionFactory.getCurrentSession().get(Customer.class, customerName);
	}

	@Override
	public Customer getCustomerById(int customerId) {
		return (Customer) sessionFactory.getCurrentSession().get(Customer.class, customerId);
	}
}
