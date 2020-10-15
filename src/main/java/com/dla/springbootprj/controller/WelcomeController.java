package com.dla.springbootprj.controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.ResponseBody;

@Controller //what are the beans?
public class WelcomeController
{
  @RequestMapping("welcome")//mvc/welcome
  @ResponseBody //telling that whatever is returned, print is as the response body
  public String welcome()
  {
      return "Welcome from Welcome Controller";//text //WEB-INF/views/<return>.jsp
  }
  
   @RequestMapping("display")//mvc/welcome
   @ResponseBody //telling that whatever is returned, print is as the resposne body
   public String display(@RequestParam String message) 
   { 
         return "Hello! your message is: " + message;//text //WEB-INF/views/<return>.jsp
   }
   
   //print out the sum of 2 numbers which I input
   
   @RequestMapping("sum")
   @ResponseBody
   public String printSum(@RequestParam int i, @RequestParam int j)
   {
       int sum = i+j;
       return "The sum is : " + sum;
   }
}
  
