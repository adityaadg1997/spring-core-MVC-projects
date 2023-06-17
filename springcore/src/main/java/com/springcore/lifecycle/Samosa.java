package com.springcore.lifecycle;

public class Samosa {
	
	public double price;

	public double getPrice() {
		return price;
	}

	public void setPrice(double price) {
		System.out.println("setting price");
		this.price = price;
	}

	public Samosa() {
		super();
		// TODO Auto-generated constructor stub
	}

	@Override
	public String toString() {
		return "Samosa [price=" + price + "]";
	}
	
	public void init() {
		System.out.println("init method called");
	}
	public void destroy() {
		System.out.println("destroy method called");
	}
	

}
