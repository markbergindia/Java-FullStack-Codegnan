package com.oop;

import com.oop.inheritance.Parentone;

public class DifferentPackageChild extends Parentone{
	
	
//
//	DifferentPackageChild() {
//		super();
//		// TODO Auto-generated constructor stub
//	}
	
	
	
	public static void main(String [] args) {
		DifferentPackageChild dpc = new DifferentPackageChild();
		System.out.println(dpc.protectedVar);
		
		
	}
}