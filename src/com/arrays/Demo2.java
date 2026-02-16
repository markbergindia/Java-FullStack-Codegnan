package com.arrays;
public class Demo2{
	public static void main(String [] args) {
		String names[] = {"bahubali","devasena","kattappa","mahishmati"};
		System.out.println(names[0]);
		System.out.println(names[3]);
		
	// for loop
		
		for(int i=0;i<=4;i++) {
			System.out.println(names[i]);
		}	
	// for loop:parameter
		for (int i=0;i<names.length;i++) {
			System.out.println(names);
		}
	}
}