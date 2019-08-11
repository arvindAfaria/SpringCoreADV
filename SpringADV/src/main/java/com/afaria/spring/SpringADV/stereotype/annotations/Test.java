package com.afaria.spring.SpringADV.stereotype.annotations;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class Test {

	public static void main(String[] args) {
		ApplicationContext context = new ClassPathXmlApplicationContext(
				"com/afaria/spring/SpringADV/stereotype/annotations/config.xml");
		Instructor obj = (Instructor) context.getBean("inst");
		System.out.println(obj);
		
		Instructor obj2 = (Instructor) context.getBean("inst");
		System.out.println(obj2);
		
	}
}
