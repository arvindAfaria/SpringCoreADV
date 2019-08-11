package com.afaria.spring.SpringADV.autowiring.assign;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;

public class Customer {

	String name;

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	@Autowired(required = false)
	@Qualifier("res")
	Reservation reserve;

	@Override
	public String toString() {
		return "Customer [name=" + name + ", reserve=" + reserve + "]";
	}
}
