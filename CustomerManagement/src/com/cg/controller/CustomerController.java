package com.cg.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.servlet.ModelAndView;

import com.cg.model.CustomerBean;
import com.cg.service.CustomerServiceImpl;

@Controller
public class CustomerController {

	
	@Autowired
	public CustomerServiceImpl customerService;
/*@RequestMapping("/start")
public String Start(){
	return "custRegForm";
}
@RequestMapping("/regForm")
public String Register(){
	return "customerSuccess";
}
@RequestMapping("/register")
public ModelAndView registerFormSubmission(CustomerBean cust){
	return new ModelAndView("success","k",cust);
}

@RequestMapping("/update")
public String update(){
	return "updateInfo";
}
@RequestMapping("/update1")
public ModelAndView updateInfo(CustomerBean cust){
	return new ModelAndView("successU","u",cust);	
}
*/
	@RequestMapping("/start")
	public String Start(){
		return "custRegForm";
	}
	
	
	@RequestMapping("/register")
	public ModelAndView registerFormSubmission(CustomerBean cust){
		
		customerService.addDetails(cust);
		return new ModelAndView("success","k",cust);
	}
	
}
