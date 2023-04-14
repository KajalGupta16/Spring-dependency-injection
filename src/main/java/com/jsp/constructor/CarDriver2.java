package com.jsp.constructor;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

import com.jsp.setter_injection.Car;

public class CarDriver2 {
	public static void main(String[] args) {
		ApplicationContext applicationContext = new ClassPathXmlApplicationContext("myspring.xml");
		Car2 car2 = (Car2) applicationContext.getBean("myCar2");
		System.out.println(car2.brand);
		System.out.println(car2.price);
		System.out.println(car2.name);
	}
}
