package com.dla.springbootprj.controller;


import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.ModelMap;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;

import com.dla.springbootprj.model.Student;
import com.dla.springbootprj.service.StudentService;

//student/add
//student/delete

@Controller
@RequestMapping("/student")
public class StudentController {
    
    @Autowired
    StudentService ss;
    
      @PostMapping("/add") //student/add
      public String addStudent(@RequestParam String name, @RequestParam String exp, ModelMap model) { 
          ss.saveStudent(new Student(name, exp));
     
     List<Student> list = ss.getAllStudents();
     
     //add list as the request attribute in home.jsp 
     
     model.put("studentList",list);
     
     return "home"; //WEB-INF/views/home.jsp }
     
  }
}
