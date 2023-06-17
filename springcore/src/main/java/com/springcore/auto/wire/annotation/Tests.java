package com.springcore.auto.wire.annotation;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class Tests {

	public static void main(String[] args) {
		
		ApplicationContext context = new ClassPathXmlApplicationContext("com/springcore/auto/wire/annotation/autowireconfig.xml");
		
		Emp e1 = (Emp) context.getBean("emp");
		
		System.out.println(e1);

	}

}
