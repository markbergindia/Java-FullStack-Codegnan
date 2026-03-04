package com.collectionsframework;

// wrapper Generic Class

public class Employee  {
	int id;
	String name;
	public Employee(int id, String name) {
		this.id = id;
		this.name = name;	
	}
	public String toString() {
		
		return "ID: "+ id + " Name: "+ name;
		
	}
	public static void main(String[] args) {
		Employee emp =new Employee(100,"markberg");
		System.out.println(emp);
	}
}
