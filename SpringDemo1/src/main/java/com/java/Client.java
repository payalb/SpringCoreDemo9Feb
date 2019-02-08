package com.java;

import org.springframework.beans.factory.BeanFactory;
import org.springframework.beans.factory.xml.XmlBeanFactory;
import org.springframework.context.ApplicationContext;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;
import org.springframework.core.io.ClassPathResource;

public class Client {


	public static void main(String[] args) {
	/*	//Lazy loading
		BeanFactory obj = new XmlBeanFactory(new ClassPathResource("spring-config.xml"));
		obj.getBean(Employee.class);*/
		
	/*	ApplicationContext ctx= new ClassPathXmlApplicationContext("spring-config.xml");*/
		
		ApplicationContext ctx= new AnnotationConfigApplicationContext(Config.class);
		Employee e=ctx.getBean(Employee.class);
		System.out.println(e);
	}

}
