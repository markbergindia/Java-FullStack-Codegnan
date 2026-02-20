package com.oop.inheritance;

public class SamePackageChild extends Parentone{
	public static void main(String [] args) {
		SamePackageChild spc = new SamePackageChild();
		System.out.println(spc.protectedVar);
	}
}