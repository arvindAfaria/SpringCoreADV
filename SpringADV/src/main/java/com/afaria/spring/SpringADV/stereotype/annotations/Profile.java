package com.afaria.spring.SpringADV.stereotype.annotations;

import org.springframework.beans.factory.annotation.Value;
import org.springframework.stereotype.Component;

@Component
public class Profile {

	@Value("something")
	private String title;
	@Value("some comp")
	private String company;

	public String getTitle() {
		return title;
	}

	public String getCompany() {
		return company;
	}

	@Override
	public String toString() {
		return "Profile [title=" + title + ", company=" + company + "]";
	}
}
