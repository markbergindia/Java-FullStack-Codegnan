package com.oop.abstractclass.shapesystem;

public class Circle extends Shape {
	private double radius;
	
	public Circle (String color, double radius) {
		super(color, "Circle");
		this.radius = radius;
	}

	@Override
	public double calculateArea() {
		// TODO Auto-generated method stub
		return Math.PI*radius*radius;
	}

	@Override
	public double calculatePerimeter() {
		// TODO Auto-generated method stub
		return 2*Math.PI*radius;
	}
	@Override
	public void displayInfo() {
		System.out.println("Radius: "+radius);
		super.displayInfo();
	}
	public double getRadius() {
		return radius;
	}

	public String getDescription() {
		// TODO Auto-generated method stub
		return null;
	}
	
	
}
