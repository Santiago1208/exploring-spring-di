package com.example.springdi.controllers;

import com.example.springdi.models.domain.Receipt;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.servlet.ModelAndView;

@Controller
@RequestMapping("/receipt")
public class ReceiptController {

	@Autowired
	private Receipt receipt;
	
	@GetMapping("/get")
	public ModelAndView getReceipt(ModelAndView modelAndView) {
		modelAndView.addObject("title", "Receipt example using dependency injection");
		modelAndView.addObject("receipt", receipt);
		modelAndView.setViewName("receipt/get");
		return modelAndView;
	}
}
