package com.oop.inheritance;

public class Test{
	public static void main(String [] args) {
		
		
//		Child child = new Child();
//		child.display();
		
		
		Animal animal = new Animal();
		animal.makeSound();
		
		Dog dog = new Dog();
		dog.makeSound();
		
		Cat cat = new Cat();
		cat.makeSound();
		
	}
}