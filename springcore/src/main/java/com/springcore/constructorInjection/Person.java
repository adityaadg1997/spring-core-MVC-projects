package com.springcore.constructorInjection;

import java.util.List;

public class Person {
	
	private String name;
	private int personId;
	private Certificate certi;
	private List<String> gadgetList;
	
	
	public Person(String name, int personId, Certificate certi, List<String> gadgetList) {
		super();
		this.name = name;
		this.personId = personId;
		this.certi = certi;
		this.gadgetList = gadgetList;
	}


	@Override
	public String toString() {
		return this.name + " : " + this.personId + " : "+ this.certi + " : " + this.gadgetList;
	}
	
	
	

}
