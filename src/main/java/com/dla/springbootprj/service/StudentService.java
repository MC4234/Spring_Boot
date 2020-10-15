package com.dla.springbootprj.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.dla.springbootprj.dao.StudentDao;
import com.dla.springbootprj.model.Student;

@Service
public class StudentService
{
    @Autowired
    StudentDao studentDao;
    
    public List<Student> getAllStudents()
    {
        /*
         * List<Student> list = new ArrayList<Student>();
         * 
         * //ideally list will get populated from backend - database
         * 
         * Student s1= new Student("Rohit", "12 years"); list.add(s1); Student s2= new
         * Student("Virat", "13 years"); list.add(s2); Student s3= new
         * Student("Md Shami", "14 years"); list.add(s3); Student s4 = new
         * Student("Sachin", "24 years"); list.add(s4);
         * 
         * return list;
         */
        
        return studentDao.getAllStudents();
    }
    
    
     public void saveStudent(Student student) { 
         studentDao.save(student); 
        }
     
}