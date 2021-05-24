package com.toyota.controller;

import java.util.ArrayList;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.servlet.ModelAndView;

import com.toyota.model.Product;
import com.toyota.service.ProductService;

@Controller
public class ProductController {
	@Autowired
	ProductService productservice;

	@RequestMapping(value = "/product", method = RequestMethod.GET)
	public ModelAndView openProduct() {
		System.out.println("...........controller");
		return new ModelAndView("product");
	}

	@RequestMapping(value = "/addProduct", method = RequestMethod.POST)
	public ModelAndView addProduct(@ModelAttribute Product product) {
		ModelAndView mv = new ModelAndView("product");
		Boolean b = productservice.addProducts(product);
		if (b != null) {
			mv.addObject("pmsg", "Products are added successfully");
		} else {

			mv.addObject("pmsg", "products are not saved");

		}
		return mv;

	}
	@RequestMapping(value="/listproducts" ,method=RequestMethod.GET)
	public ModelAndView listProducts() {
		ModelAndView mv= new ModelAndView("listproducts");
		  ArrayList<Product> p= productservice.getProducts();
		  return mv.addObject("products", p);
		  
		  }
}
