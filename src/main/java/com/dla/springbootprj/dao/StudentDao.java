package com.dla.springbootprj.dao;


import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.jdbc.core.BeanPropertyRowMapper;
import org.springframework.jdbc.core.JdbcTemplate;
import org.springframework.jdbc.core.RowMapper;
import org.springframework.stereotype.Repository;

import com.dla.springbootprj.model.Student;

@Repository
public class StudentDao
{
    //create db connection - to h2 databse using jdbc
    
    @Autowired
    JdbcTemplate jdbcTemplate;
    
    public List<Student> getAllStudents()
    {
        /*
         * return jdbcTemplate.query("select * from student", new RowMapper<Student>() {
         * 
         * @Override public Student mapRow(ResultSet rs, int rowSum) throws SQLException
         * { return new Student(rs.getString("name"), rs.getString("exp")); } });
         */
        
        return jdbcTemplate.query("select * from student", new BeanPropertyRowMapper<Student>(Student.class));
    }
    
    public void save(Student student) 
     {
        //array of arguments - student record will be inserted in the db.
       jdbcTemplate.update("insert into student(name,exp) values (?,?)", new Object[] {student.getName(), student.getExp()}); }
     }