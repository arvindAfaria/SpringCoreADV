package com.afaria.spring.SpringADV.injecting.interfaces;

public class OrderBOImpl implements OrderBO {

	private OrderDAO dao;

	@Override
	public void placeOrder() {

		System.out.println("inside order BO");
		dao.createOrder();
	}

	public OrderDAO getDao() {
		return dao;
	}

	public void setDao(OrderDAO dao) {
		this.dao = dao;
	}

}
