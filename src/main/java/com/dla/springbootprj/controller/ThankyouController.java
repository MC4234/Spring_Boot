package com.dla.springbootprj.controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;

@Controller
public class ThankyouController {
	
	
	   @GetMapping("thankyou")
	   public String sayThanks()
	   {
	       return "thankyou";//WEB-INF/views/thankyou.jsp
	   }
	}