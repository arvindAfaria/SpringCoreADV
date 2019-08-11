package com.afaria.spring.SpringADV.injecting.interfaces;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class Test {

	public static void main(String[] args) {

		ApplicationContext context = new ClassPathXmlApplicationContext(
				"com/afaria/spring/SpringADV/injecting/interfaces/config.xml");
		OrderBO obj = (OrderBO) context.getBean("bo");
		obj.placeOrder();
	}
}
