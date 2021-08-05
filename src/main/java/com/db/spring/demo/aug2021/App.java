package com.db.spring.demo.aug2021;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.AbstractApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

/**
 * 
 * @author Vaman Deshmukh
 *
 */

public class App {

	public static void main(String[] args) {

//	     Employee obj = new Employee();
//	     Employee obj2 = new Employee();
//	     obj.work();

		ApplicationContext context = new ClassPathXmlApplicationContext("SpringConfig.xml");
		
		Employee emp = context.getBean("employee", Employee.class);
		emp.work();

//		Employee emp2 = context.getBean("employee", Employee.class);
//		System.out.println(emp.hashCode());
//		System.out.println(emp2.hashCode());
//		System.out.println(emp.equals(emp2));
				
		
		((AbstractApplicationContext) context).close();
	}
}
