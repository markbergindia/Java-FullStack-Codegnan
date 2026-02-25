package com.oop.abstractclass.shapesystem;

public class Rectangle extends Shape{
	private double length;
	private double width;
	
	public Rectangle(String color, double length, double width) {
		super(color, "Rectangle");
		this.length = length;
		this.width = width;
	}

	@Override
	public double calculateArea() {
		// TODO Auto-generated method stub
		return length * width;
	}

	@Override
	public double calculatePerimeter() {
		// TODO Auto-generated method stub
		return 2 * (length + width);
	}
	
	
	public void displayInfo() {
		System.out.println("Length: "+ length);
		System.out.println("Width: "+ width);
		super.displayInfo();
	}
	public double getLength() {
		return length;
	}
	
	public double getWidth() {
		return width;
		
	}

}
