package com.collectionsframework;

//generic class 

public class Printer <T>{
	T value;
	Printer(T value){
		this.value=value;
	}
	public void print() {
		System.out.println(value);
	}	
}
