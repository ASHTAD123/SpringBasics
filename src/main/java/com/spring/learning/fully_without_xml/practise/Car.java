package com.spring.learning.fully_without_xml.practise;

public class Car {

	private String brand;
	private String model;
	private String color;
	private Engine engine;


	public Car() {
		super();
		// TODO Auto-generated constructor stub
	}

	public Car(String brand, String model, String color, Engine engine) {
		super();
		this.brand = brand;
		this.model = model;
		this.color = color;
		this.engine = engine;
	}

	public void setEngine(Engine engine) {
		this.engine = engine;
	}

	public Engine getEngine() {
		System.out.println("Getting engine");
		this.engine.start();
		return engine;
	}

	public String getBrand() {
		return brand;
	}

	public void setBrand(String brand) {
		this.brand = brand;
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

	@Override
	public String toString() {
		return "Car [brand=" + brand + ", model=" + model + ", color=" + color + ", engine=" + engine + "]";
	}
	

}
