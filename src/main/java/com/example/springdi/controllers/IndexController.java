package com.example.springdi.controllers;

import com.example.springdi.models.services.IMyService;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.servlet.ModelAndView;

@Controller
public class IndexController {

	@Autowired
	@Qualifier("myDummyService")
	private IMyService myService;
	
	@GetMapping({"", "/", "/index"})
	public ModelAndView index(ModelAndView modelAndView) {
		modelAndView.addObject("object", myService.operation());
		modelAndView.setViewName("index");
		return modelAndView;
	}

	public IMyService getMyService() {
		return myService;
	}

}
