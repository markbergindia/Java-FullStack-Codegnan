package com.codegnan.dsa;

public class SumOfDigitsUsingRecursion {
	public static int sum(int n) {
		if (n<=1) {
			return n;
		}
		return n%10 + sum(n/10);
	}
	
	public static void main(String[] args) {
		int n = 1234;
		int result = sum(n);
		System.out.println(" SumOfDigits: "+result);
	}

}
