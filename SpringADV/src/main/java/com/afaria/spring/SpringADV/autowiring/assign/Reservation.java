package com.afaria.spring.SpringADV.autowiring.assign;

public class Reservation {

	int id;
	String day;

	public int getId() {
		return id;
	}

	public void setId(int id) {
		this.id = id;
	}

	public String getDay() {
		return day;
	}

	public void setDay(String day) {
		this.day = day;
	}

	@Override
	public String toString() {
		return "Reservation [id=" + id + ", day=" + day + "]";
	}
}
