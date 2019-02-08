package com.java;

import lombok.Data;

@Data
public class Employee {
	int id;
	String name;
	Address address;
	
	Employee(Address address){
		System.out.println("object created");
		this.address= address;
	}
}
@Data
class Address{
	int hNo;
	String city, state;
	int pincode;
	private Address(Integer hNo, String city, String state, Integer pincode) {
		System.out.println("constructor called");
		this.hNo= hNo;
		this.city= city;
		this.state= state;
		this.pincode=pincode;
	}

}