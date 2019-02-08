package com.java;

import java.lang.reflect.Constructor;
import java.lang.reflect.InvocationTargetException;

import org.springframework.beans.factory.annotation.Autowire;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.context.annotation.Lazy;
import org.springframework.context.annotation.Scope;

@Scope("singleton")
@Configuration
public class Config {

	@Scope(value="prototype")
	@Bean
	public Address getAddress() throws NoSuchMethodException, SecurityException, InstantiationException, IllegalAccessException, IllegalArgumentException, InvocationTargetException {
		/*return new Address(10, "Delhi", "Delhi", 250001);*/
		Class obj=Address.class;
		//When the class is loaded, it creates the class object
		//Has all the metadat information
		Constructor c=obj.getDeclaredConstructor(Integer.class, String.class, String.class, Integer.class);
		c.setAccessible(true);
		Address a=(Address) c.newInstance(10, "Delhi", "Delhi", 120002);
		return a;
	}
	
/*	@Scope(value="prototype")
	@Bean(autowireCandidate=false)
	public Address getAddress1() throws NoSuchMethodException, SecurityException, InstantiationException, IllegalAccessException, IllegalArgumentException, InvocationTargetException {
		return new Address(10, "Delhi", "Delhi", 250001);
		Class obj=Address.class;
		//When the class is loaded, it creates the class object
		//Has all the metadat information
		Constructor c=obj.getDeclaredConstructor(Integer.class, String.class, String.class, Integer.class);
		c.setAccessible(true);
		Address a=(Address) c.newInstance(10, "Delhi", "Delhi", 120002);
		return a;
	}
	*/
	@Lazy
	@Bean
	public Employee getEmp() throws NoSuchMethodException, SecurityException, InstantiationException, IllegalAccessException, IllegalArgumentException, InvocationTargetException {
		Employee emp= new Employee(getAddress());
		emp.setId(1);
		emp.setName("payal");
		return emp;
	}
}
