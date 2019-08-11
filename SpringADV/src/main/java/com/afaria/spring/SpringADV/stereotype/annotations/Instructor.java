package com.afaria.spring.SpringADV.stereotype.annotations;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.context.annotation.Scope;
import org.springframework.stereotype.Component;

@Component("inst")
@Scope("prototype")
public class Instructor {

	// @Value("#{T(com.afaria.spring.SpringADV.stereotype.annotations.SomeClass).abcd}")
	@Value("#{new com.afaria.spring.SpringADV.stereotype.annotations.SomeClass().abcd}")
	private int id;
	@Value("#{new String('ABCDefgh').toUpperCase()}")
	private String lang;

	@Value("#{list1}")
	private List list;

	@Value("#{7>5}")
	private boolean active;

	@Autowired
	private Profile prof;

	@Override
	public String toString() {
		System.out.println(prof.getCompany());
		if (active) {
			return "Instructor [id=" + id + ", name=" + lang + ", list=" + list + "prof=" + prof + "]";
		} else {
			return null;
		}
	}

}
