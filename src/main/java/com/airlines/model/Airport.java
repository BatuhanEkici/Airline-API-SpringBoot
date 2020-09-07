package com.airlines.model;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;

@Entity
public class Airport {

	@Id
	@GeneratedValue
	private long id;
	
	private String name;
	
	private String city; //Yalnızca Türkiye'deki havaalanları düşünülerek sadece city field'ı eklenmiştir.
	
	
	public long getId() {
		return id;
	}

	public void setId(long id) {
		this.id = id;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public String getCity() {
		return city;
	}

	public void setCity(String city) {
		this.city = city;
	}

	@Override
	public String toString() {
		return "Airport [id=" + id + ", name=" + name + ", city=" + city + "]";
	}
	
	
}
