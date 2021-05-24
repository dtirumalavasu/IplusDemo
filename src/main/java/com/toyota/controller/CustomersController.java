package com.toyota.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.servlet.ModelAndView;

import com.toyota.model.Customer;
import com.toyota.service.CustomerService;

@Controller
public class CustomersController {
	@Autowired
	public CustomerService customerService;

	@RequestMapping(value = "/customerRegister", method = RequestMethod.GET)
	public ModelAndView openCRegister() {
		return new ModelAndView("customerRegister");
	}

	@RequestMapping(value = "/customerDoRegister", method = RequestMethod.POST)
	public ModelAndView doCRegister(@ModelAttribute Customer customer) {
		ModelAndView mv = new ModelAndView("customerRegister");
		System.out.println("----------" + customer);
		Boolean b = customerService.doRegister(customer);
		if (b) {
			mv.addObject("msg", "registration Success");

		} else {
			mv.addObject("msg", "registration Failure");
		}
		System.out.println("-------------------"+mv);
		return mv;
		
	}

	@RequestMapping(value = "/clogin", method = RequestMethod.GET)
	public ModelAndView openCLogin() {

		return new ModelAndView("clogin");
	}

	@RequestMapping(value = "/openCustomer", method = RequestMethod.POST)
	public ModelAndView doCLogin(@ModelAttribute Customer customer) {
		ModelAndView mv;
		Customer c = customerService.doLogin(customer);
		System.out.println("**************controller" + c);
		if (c != null) {
			System.out.println("++++++++++logindata"+c);
			mv = new ModelAndView("cloginsucess");
			mv.addObject("customer", c);
		} else {
			mv = new ModelAndView("clogin");
			mv.addObject("msg", "loginfailure");
		}

		return mv;

	}
}