package com.codegnan.dsa;

public class PalindromeNumber {
	public static void main(String[] args) {

	int num = 121;
	int original = num;
	int reverse = 0;
	while (num > 0) {
		int temp = num%10;
		reverse = reverse * 10 + temp;
		num = num / 10;
	}
	if(original == reverse) {
		System.out.println("Is Palindrome");
	}else {
		System.out.println("not palindrome");
	}
	}
}
