package com.toyota.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.servlet.ModelAndView;

import com.toyota.model.Delar;
import com.toyota.service.DelarService;

@Controller
public class DelarController {
	@Autowired
	DelarService delarService;

	@RequestMapping(value = "/delarRegister", method = RequestMethod.GET)
	public ModelAndView openRegister() {
		return new ModelAndView("delarRegister");
	}

	@RequestMapping(value = "/delarDoRegister", method = RequestMethod.POST)
	public ModelAndView doRegister(@ModelAttribute Delar delar) {
		System.out.println("-----------------" + delar);
		ModelAndView mv = new ModelAndView("delarRegister");
		Boolean b = delarService.dRegister(delar);

		System.out.println(";;;;;;;;;;;;;;;;;;;;;" + b);
		if (b != null) {
			mv.addObject("msg", "DelarValues successfully Registered");
		} else {
			mv.addObject("msg", "DelarValues not Registered");
			System.out.println(mv);
		}

		return mv;

	}

	@RequestMapping(value = "/dlogin", method = RequestMethod.GET)
	public ModelAndView openDlogin() {
		return new ModelAndView("dlogin");

	}

	@RequestMapping(value = "/openDelar", method = RequestMethod.POST)
	public ModelAndView doDlogin(@ModelAttribute Delar delar) {
		ModelAndView mv;
		Delar d = delarService.dLogin(delar);
		if (d != null) {
			mv = new ModelAndView("dloginsucess");
			mv.addObject("delar", d);

		} else {
			mv = new ModelAndView("dlogin");
			mv.addObject("msg", "login Failure");
		}
		return mv;
	}
}
