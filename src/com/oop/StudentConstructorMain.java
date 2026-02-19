package com.oop;
public class StudentConstructorMain{
	public static void main(String [] args) {
		StudentConstructor sc = new StudentConstructor("sriram",22);
		System.out.println("Name : "+ sc.getName());
		System.out.println("Age : "+ sc.getAge());
		StudentConstructor scanner = new StudentConstructor();
		scanner.setName("mark");
		scanner.setAge(22);
		System.out.println("Name : "+ scanner.getName());
		System.out.println("Age : "+ scanner.getAge());
	}
}