package com.afaria.spring.SpringADV.autowiring;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class Test {

	public static void main(String[] args) {
		ApplicationContext context = new ClassPathXmlApplicationContext(
				"com/afaria/spring/SpringADV/autowiring/config.xml");
		Employee obj = (Employee) context.getBean("emp");
		System.out.println(obj);
	}
}
