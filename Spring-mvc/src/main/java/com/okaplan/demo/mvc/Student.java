package com.okaplan.demo.mvc;

import java.util.LinkedHashMap;

public class Student {
	private String firstName;
	private String lastName;
	private String country;
	private LinkedHashMap<String,String> countryOptions;
	private String favoriteLanguage;
	private String[] operatingSytems;
	public Student() {
		countryOptions=new LinkedHashMap <String,String>();
		countryOptions.put("TR", "Turkey");
		countryOptions.put("DE", "Germany");
		countryOptions.put("USA", "United States");
		countryOptions.put("FR", "France");
	}
	public String getFavoriteLanguage() {
		return favoriteLanguage;
	}

	public void setFavoriteLanguage(String favoriteLanguage) {
		this.favoriteLanguage = favoriteLanguage;
	}

	public LinkedHashMap<String, String> getCountryOptions() {
		return countryOptions;
	}

	public String getFirstName() {
		return firstName;
	}

	public void setFirstName(String firstName) {
		this.firstName = firstName;
	}

	public String getLastName() {
		return lastName;
	}

	public String getCountry() {
		return country;
	}

	public void setCountry(String country) {
		this.country = country;
	}

	public void setLastName(String lastName) {
		this.lastName = lastName;
	}
	public String[] getOperatingSytems() {
		return operatingSytems;
	}
	public void setOperatingSytems(String[] operatingSytems) {
		this.operatingSytems = operatingSytems;
	}
	
	
	
	
	
}
