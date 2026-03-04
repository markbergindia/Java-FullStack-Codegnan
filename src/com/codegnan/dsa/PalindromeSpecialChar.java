package com.codegnan.dsa;

public class PalindromeSpecialChar {
	public static void main(String[] args) {
		String str = "a man,a plan,a canal : panama";
		str = str.replaceAll("[^a-zA-Z0-9]","").toLowerCase();
		String reverse = "";
		for(int i = str.length()-1;  i >= 0; i--) {
			reverse = reverse + str.charAt(i);	
		}
		if(str.equals(reverse)) {
			System.out.println("palindrome");
		}else {
			System.out.println("Not palindrome");
		}
	}

}
