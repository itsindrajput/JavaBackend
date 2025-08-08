package com.bytexl.hibernate;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

import com.bytexl.hibernate.dao.StudentDAO;
import com.bytexl.hibernate.entities.Student;

public class App 
{
    public static void main( String[] args )
    {
    		ApplicationContext context = new ClassPathXmlApplicationContext("config.xml");
    		StudentDAO studentDao = context.getBean("studentDao",StudentDAO.class);
    		
    		Student student = new Student(102, "Onkar Singh", "DSA", "Padrauna");
    		
    		int result = studentDao.insert(student);
    		System.out.println(result);
    }
}
