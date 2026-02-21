package com.oop.inheritance.overriding.rules;

public class Child extends Parent{
	
	public Child() {
		super();// calls parent Constructor
		System.out.println("child Constructor");
		
	}
	
	@Override
	protected void show() {
		System.out.println("Child Show method");
		
	}

}
