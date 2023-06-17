package com.springcore.stereotype.annotation;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class Tests {

	public static void main(String[] args) {
		
		ApplicationContext context = new ClassPathXmlApplicationContext("com/springcore/stereotype/annotation/stereotypeconfig.xml");
		
		Student s1 = context.getBean("student", Student.class);
//		System.out.println(s1);
		
//		System.out.println("+++++++++++++++++++++++++++++++");
		
//		System.out.println(s1.getAddress());
//		System.out.println(s1.getAddress().getClass().getName());
//		
//		System.out.println(s1.hashCode());
		
		Teacher t1 = context.getBean("teacher", Teacher.class);
		System.out.println(t1.hashCode());
		Teacher t2 = context.getBean("teacher", Teacher.class);
		System.out.println(t2.hashCode());
		
		

	}

}
