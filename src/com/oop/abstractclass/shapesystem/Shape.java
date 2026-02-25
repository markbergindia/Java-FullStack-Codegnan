package com.oop.abstractclass.shapesystem;

public abstract class Shape {
	private String color;
	private String name;
	
	public Shape(String color, String name) {
		
		this.color= color;
		this.name=name;
		}
	public abstract double calculateArea();
	public abstract double calculatePerimeter();
	
	public void displayInfo() {
		System.out.println("==== "+ name + "====");
		System.out.println("color: "+ color);
		System.out.println("Area: "+ calculateArea());
		System.out.println("perimeter: "+calculatePerimeter());
		
	}
	
	public String getDescription() {
		return "A" + color + " " + name;
		
	}
	
	public String getColor() {
		return color;
	}
	public String getName() {
		return name;
	}

}
