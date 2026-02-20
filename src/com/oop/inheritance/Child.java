package com.oop.inheritance;
public class Child extends Parent{
	Object obj;
	Child(){
		super();
//		super("sriram");
		System.out.println("child constructor");
	}
	void display() {
//		super.display();
		System.out.println("child method");
	}
	
}