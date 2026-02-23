package com.oop.abstraction;

abstract class vehicle {
	void starts() {
		System.out.println("Vehicle starts");
	}
	
	void stops() {
		System.out.println("vehicle stops");
	}
	
	abstract void startswith();	//abstract method

}
