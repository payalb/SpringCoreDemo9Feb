package com.java;

public interface Shape {
	float area();
	//static factory method: returning object of same class
	public static Shape getInstance(int... args) {
		if(args.length==1) {
			return new Square(args[0]);
		}else if(args.length==2) {
			return new Rectangle(args[0], args[1]);
		}else {
			return null;
		}
	}
}

class Square implements Shape{
	Square(int length){
		this.length= length;
	}
	int length;
	public float area() {
		return length* length;
	}
	
	
}
class Rectangle implements Shape{
	int length, breadth;
	Rectangle(int length, int breadth){
		this.length= length;
		this.breadth= breadth;
	}
	public float area() {
		return length* breadth;
	}
}