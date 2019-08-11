package com.afaria.spring.SpringADV.autowiring.assign;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class Test {

	public static void main(String[] args) {
		ApplicationContext context = new ClassPathXmlApplicationContext(
				"com/afaria/spring/SpringADV/autowiring/assign/config.xml");
		Customer obj = (Customer) context.getBean("mainBean");
		System.out.println(obj);
	}
}
