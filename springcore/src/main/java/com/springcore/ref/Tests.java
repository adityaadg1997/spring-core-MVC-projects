package com.springcore.ref;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class Tests {

	public static void main(String[] args) {
		ApplicationContext context = new ClassPathXmlApplicationContext("com/springcore/ref/refconfig.xml");
		A a = (A) context.getBean("aref");
		B b = (B) context.getBean("bref");
		
		System.out.println(a.getX());
		System.out.println(a.getObj().getY());
		
		System.out.println(a);
		System.out.println(b);
		

	}

}
