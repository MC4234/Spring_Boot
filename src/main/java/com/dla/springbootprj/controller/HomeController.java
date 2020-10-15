package com.dla.springbootprj.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.ModelMap;
import org.springframework.web.bind.annotation.GetMapping;

import com.dla.springbootprj.model.Student;
import com.dla.springbootprj.service.StudentService;


@Controller
public class HomeController 
{
    @Autowired
    StudentService hs;
    
    @GetMapping("/home") //home
    public String showHome(ModelMap model)
    {
        //get the Students list
        List<Student> list = hs.getAllStudents();
        
        //add list as the request attribute in home.jsp
        model.put("studentList", list);
        
        return "home"; //WEB-INF/views/home.jsp
    }
}
