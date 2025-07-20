package com.springReference.Injection;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class Test {
	public static void main(String[] args) {
		ApplicationContext context = new ClassPathXmlApplicationContext("com/springReference/Injection/refConfig.xml");
		A temp = (A) context.getBean("refA");
		System.out.println(temp.getX());
		System.out.println(temp.getObj().getY());
	}
}
