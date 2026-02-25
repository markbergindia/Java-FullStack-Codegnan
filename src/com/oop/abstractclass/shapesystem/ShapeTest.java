package com.oop.abstractclass.shapesystem;

public class ShapeTest {
	public static void main(String[] args) {
		Circle circle = new Circle("Red", 5.0);
		Rectangle rectangle = new Rectangle("Blue", 10.0, 5.0);
		circle.displayInfo();
		System.out.println("Description: "+circle.getDescription());
		System.out.println();
		
		rectangle.displayInfo();
		System.out.println("Description: "+ rectangle.getDescription());
		System.out.println();
		
		Shape shape1 = new Circle("Green", 7.0);
		Shape shape2 = new Rectangle("Yellow", 8.0 ,6.0);
		
		System.out.println("======Polymorphism Demo======");
		shape1.displayInfo();
		System.out.println();
		shape2.displayInfo();
		
		
	}

}
