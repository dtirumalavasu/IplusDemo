package com.toyota.dao;

import java.util.ArrayList;

import org.springframework.stereotype.Service;

import com.toyota.model.Product;

@Service
public interface ProductDao {
	public boolean addProducts(Product product);
	public ArrayList<Product> getProducts();
	public Product editById(int productId);
	public Product deleteById(int productId);

}
