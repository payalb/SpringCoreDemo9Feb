package com.java;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.stereotype.Component;

import lombok.Data;

@Data
@Component
public class Employee {
	@Value("1")
	int id;
	@Value("Payal")
	String name;
	@Autowired //byType //does not need a constructor or a setter
	@Qualifier("address") //byName
	Address address;
	
	Employee(){
		System.out.println("object created");
	}
}
@Data
@Component("address")
class Address{
	int hNo;
	String city;
	String state;
	int pincode;
	private Address(@Value("10")int hNo,@Value("Delhi") String city, @Value("Delhi")String state, @Value("34434")int pincode) {
		System.out.println("constructor called");
		this.hNo= hNo;
		this.city= city;
		this.state= state;
		this.pincode=pincode;
	}

}