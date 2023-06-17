package com.springcore.standalonecollections;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class Tests {

	public static void main(String[] args) {
		
		ApplicationContext context = new ClassPathXmlApplicationContext("com/springcore/standalonecollections/standaloneconfig.xml");
		
		Person p1 = context.getBean("person", Person.class);
		System.out.println(p1.getBestfriend());
		System.out.println("---------------------------");
		
		System.out.println(p1.getFeesStructure());
		System.out.println("---------------------------");
		System.out.println(p1.getProperties());
	}

}
