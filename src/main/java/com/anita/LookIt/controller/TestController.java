package com.anita.LookIt.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;

import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.servlet.ModelAndView;

import com.anita.LookIt.ServiceLayer.CommonService;
import com.anita.LookIt.dto.ForgetPasswordDTO;
import com.anita.LookIt.dto.LogInDTO;
import com.anita.LookIt.dto.Register;

@Controller

public class TestController {
	   @Autowired
	  private CommonService service;
	@RequestMapping(value="/signUp" ,method=RequestMethod.POST)
	public ModelAndView registration(Register  register) {
		ModelAndView modelAndView =new ModelAndView();
		String msg = service.validateandSave(register);
		System.out.println(msg);
		modelAndView.addObject("responsemsg", msg);
		modelAndView.setViewName("Home.jsp");
	    return modelAndView;
	 
	}
	 
	@RequestMapping(value="/login" , method=RequestMethod.POST)
	public ModelAndView logIn(LogInDTO login) {
		  ModelAndView modelAndView = new  ModelAndView ();
		  String response =service.validateandLogin(login);
		  System.out.println(response);
		  modelAndView.addObject("responsemsg", response);
		  if(response.contains( "Login Successfully")) {
			  modelAndView.setViewName("Home.jsp");
		  }else {
			  modelAndView.setViewName("LogIn.jsp"); 
		  }
		return modelAndView;
		  
	}
	
	@RequestMapping(value="/OTP" ,method=RequestMethod.POST)
	public ModelAndView sendOTP(String email) {
		ModelAndView  modelAndView = new ModelAndView();
		System.out.println(email);
		String response = service.validateandsendotp(email);
		System.out.println(response);
		modelAndView.addObject("responsemsg", response);
		modelAndView.setViewName("/ForgetPassword.jsp");
		
		
		return modelAndView;
	}
	@RequestMapping(value="/forgetpassword" ,method=RequestMethod.POST)
   public ModelAndView forgetpassword(ForgetPasswordDTO dto) {
	 ModelAndView modelAndView = new ModelAndView();
	 System.out.println(dto);
	 String respose  = service.validateandupdatepassword(dto);
	 System.out.println(respose);
	 modelAndView.addObject("responsemsg", respose);
	 if("password Updated".equals(respose)) {
		 modelAndView.setViewName("/LogIn.jsp");
	 }else {
		 modelAndView.setViewName("/ForgetPassword.jsp");
	 }
	 
	return modelAndView;
	 
	 
 }
	}
 

