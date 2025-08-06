package com.bytexl.jdbc;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;
import org.springframework.jdbc.core.JdbcTemplate;

public class App {
	public static void main(String[] args) {
		System.out.println("Jdbc Connectivity..!");
	 	ApplicationContext context = new ClassPathXmlApplicationContext("com/bytexl/jdbc/config.xml");
	 	JdbcTemplate template = context.getBean("jdbcTemplate", JdbcTemplate.class);
	 	
	 	System.out.println(template);
	 	
	 	String query = "insert into student(rollNo, name, course) values(?,?,?)";
	 	
	 	int result = template.update(query,102, "Aman Singh", "ADSA");
	 	System.out.println("Record Inserted.." + result);
	 
	}
}
