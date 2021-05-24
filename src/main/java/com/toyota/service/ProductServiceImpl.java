package com.toyota.service;

import java.util.ArrayList;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import com.toyota.dao.ProductDao;
import com.toyota.model.Product;

@Transactional
@Service("productService")
public class ProductServiceImpl implements ProductService {
	@Autowired
	public ProductDao productDao;

	@Override
	public boolean addProducts(Product product) {

		return productDao.addProducts(product);
	}

	@Override
	public ArrayList<Product> getProducts() {

		return (ArrayList<Product>) productDao.getProducts();
	}

	@Override
	public Product editById(int productId) {

		return productDao.editById(productId);
	}

	@Override
	public Product deleteById(int productId) {

		return productDao.deleteById(productId);
	}

}
