package com.dla.springbootprj.model;




public class Student {


	 public String name;
	 public String exp;
	 
    public Student() {
    	
    	
    }
    
    public String getExp() {
        return exp;
    }

    public void setExp(String exp) {
        this.exp = exp;
    }

    public Student(String name, String exp)
    {
        this.name=name;
        this.exp=exp;
    }
    
    public String getName() {
        return name;
    }
    
    public void setName(String name) {
        this.name = name;
    }
    
      
    
}