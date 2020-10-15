package com.dla.springbootprj.service;



import java.util.ArrayList;
import java.util.List;

import org.springframework.stereotype.Service;

import com.dla.springbootprj.model.Student;


@Service
public class HomeService {
    
    public List<Student> getAllStudents()
    {
        //database call
        List<Student> list = new ArrayList<Student>();
        list.add(new Student("Rohit Sharma","3 yrs"));
        list.add(new Student("Virat Kohli","6 yrs"));
        list.add(new Student("MS Dhoni","9 yrs"));
        list.add(new Student("KL Rahul","7 yrs"));
        return list;
    }

}