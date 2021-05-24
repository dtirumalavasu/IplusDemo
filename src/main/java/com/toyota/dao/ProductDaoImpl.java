package com.toyota.dao;

import java.util.ArrayList;

import org.hibernate.SessionFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Repository;

import com.toyota.model.Product;

@Repository("productDao")
public class ProductDaoImpl implements ProductDao {

	@Autowired
	public SessionFactory sessionFactory;

	public SessionFactory getSessionFactory() {
		return sessionFactory;
	}

	@Override
	public boolean addProducts(Product product) {
		int i = (int) sessionFactory.getCurrentSession().save(product);
		if (i > 0) {
			return true;
		} else {
			return false;
		}
	}

	@Override
	public ArrayList<Product> getProducts() {

		return (ArrayList<Product>) sessionFactory.getCurrentSession().createQuery("from Product").list();
	}

	@Override
	public Product editById(int productId) {

		return sessionFactory.getCurrentSession().get(Product.class, productId);
	}

	@Override
	public Product deleteById(int productId) {

		return sessionFactory.getCurrentSession().get(Product.class, productId);
	}

}
