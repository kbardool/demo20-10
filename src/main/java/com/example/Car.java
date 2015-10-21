package com.example;
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Table;

public class Car {
	@Id
	@GeneratedValue(strategy = GenerationType.AUTO)
	private long id;
	
	private String model;
	private String color;
	
	
	public Car() {
		super();
		// TODO Auto-generated constructor stub
	}
	public Car(String model, String color ) {
		this.color = color;
		this.model = model;
	}
	
	public String getModel() {
		return model;
	}
	public void setModel(String model) {
		this.model = model;
	}
	public String getColor() {
		return color;
	}
	public void setColor(String color) {
		this.color = color;
	}
	
	
}
