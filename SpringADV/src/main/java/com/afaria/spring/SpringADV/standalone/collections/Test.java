package com.afaria.spring.SpringADV.standalone.collections;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class Test {

	public static void main(String[] args) {
		ApplicationContext context = new ClassPathXmlApplicationContext(
				"com/afaria/spring/SpringADV/standalone/collections/config.xml");
		ProductsList obj = (ProductsList) context.getBean("mainBean");
		System.out.println(obj.getProdnames());
	}
}
