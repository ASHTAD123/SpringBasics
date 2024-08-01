package com.spring.lifecycleMethods;

public class Food {
		
	private double cost;


	@Override
	public String toString() {
		return "Food [cost=" + cost + "]";
	}

	public double getCost() {
		return cost;
	}

	public void setCost(double cost) {
		System.out.println("Setting cost");
		this.cost = cost;
	}
	
	public void init() {
		System.out.println("Initialization");
	}
	public void destroy() {
		System.out.println("Destroy");
	}
}
