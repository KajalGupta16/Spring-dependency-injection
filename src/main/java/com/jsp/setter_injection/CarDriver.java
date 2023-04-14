package com.jsp.setter_injection;

import org.springframework.beans.factory.BeanFactory;
import org.springframework.beans.factory.xml.XmlBeanFactory;
import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;
import org.springframework.core.io.ClassPathResource;

public class CarDriver {
	public static void main(String[] args) {
		// with bean factory
		ClassPathResource classPathResource = new ClassPathResource("myspring.xml");
		BeanFactory beanFactory = new XmlBeanFactory(classPathResource);
		Car car = (Car) beanFactory.getBean("myCar");

		// with Application context
		ApplicationContext applicationContext = new ClassPathXmlApplicationContext("myspring.xml");
		Car car1 = (Car) applicationContext.getBean("myCar");

		System.out.println(car1.getName());
		System.out.println(car1.getColor());
		System.out.println(car1.getBrand());
	}
}
