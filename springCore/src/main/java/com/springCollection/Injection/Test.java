package com.springCollection.Injection;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class Test {
	public static void main(String[] args) {
		ApplicationContext context = new ClassPathXmlApplicationContext("com/springCollection/Injection/collectionConfig.xml");
		Employee emp1 = (Employee) context.getBean("emp1");
		
		System.out.println(emp1.getEmp_Code());
		System.out.println(emp1.getSubject_Code());
		System.out.println(emp1.getClass_Code());
		System.out.println(emp1.getSub_Duration());
		System.out.println(emp1.getEmp_Prop());
	}
}
