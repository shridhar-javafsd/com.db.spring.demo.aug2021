package com.db.spring.demo.aug2021;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

/**
 * 
 * @author Vaman Deshmukh
 *
 */

public class App {

	public static void main(String[] args) {

//	     Employee obj = new Employee();
//	     obj.work();

		ApplicationContext context = new ClassPathXmlApplicationContext("SpringConfig.xml");
		Employee emp = context.getBean("employee", Employee.class);
		emp.work();
	}
}
