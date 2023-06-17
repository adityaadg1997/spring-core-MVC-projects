package com.springcore.constructorInjection;

public class Addition {
	
	private int a;
	private int b;

	public Addition(double a, double b) {
		System.out.println("calling double constructor");
		this.a = (int) a;
		this.b = (int) b;
	}
	
	public Addition(int a, int b) {
		System.out.println("calling int constructor");
		this.a = a;
		this.b = b;
	}
	
	public void doSum() {
		System.out.println("this.a = " + this.a + " this.b = " + this.b);
		System.out.println(this.a + this.b);
	}
	

}
