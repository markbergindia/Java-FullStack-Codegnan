//		Write a Java program demonstrating ArithmeticException and ArrayIndexOutOfBoundsException being generated and handled.
//			• Define a Division class with a divide() method in which both exceptions may occur on the same line.
//			• Use appropriate exception handling techniques to handle them.
//			• MainProgram class is not required.

package com.test.programs;

public class Division {
	void divide(int [] arr,int index,int divisor) {
		try {
			int result = arr[index]/divisor;
			System.out.println("result"+ result);
		}catch(ArithmeticException e) {
			System.out.println("ArithmeticException caught: cannot by divide by zero");
		}catch(ArrayIndexOutOfBoundsException e) {
			System.out.println("ArrayIndexOutOfBoundsException caught: Invalid array index");
		}catch(Exception e) {
			System.out.println("Some other exception occured: "+e);
		}
		System.out.println("programs after execution handling");
	}
	
	public static void main(String[] args) {
		Division obj = new Division();
		int [] numbers = {20,30,40,80};
		obj.divide(numbers, 5, 2);
		obj.divide(numbers, 1, 0);
	}

}
