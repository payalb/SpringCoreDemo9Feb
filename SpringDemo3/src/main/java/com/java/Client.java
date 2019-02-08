package com.java;

import java.sql.Connection;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class Client {


	public static void main(String[] args) {
	
		ApplicationContext ctx= new ClassPathXmlApplicationContext("spring-config.xml");
		Shape shape=ctx.getBean(Shape.class);
		System.out.println(shape.area());
		
		Connection c1= ctx.getBean(Connection.class);
		Connection c2= ctx.getBean(Connection.class);
		System.out.println(c1);
		System.out.println(c2);
	}

}
