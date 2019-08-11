package com.afaria.spring.SpringADV.autowiring.annotations;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;

public class Employee {

	@Autowired(required = true)
	@Qualifier("address2")
	private Address address;

	@Override
	public String toString() {
		return "Employee [address=" + address + "]";
	}
}
