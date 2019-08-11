package com.afaria.spring.SpringADV.injecting.interfaces;

public class OrderDAOImpl implements OrderDAO {

	@Override
	public void createOrder() {

		System.out.println("inside order DAO");
	}

}
