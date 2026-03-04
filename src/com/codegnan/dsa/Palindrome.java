package com.codegnan.dsa;

public class Palindrome {
	public static void main(String[] args) {
		String word = "madam";
		String reversed = "";
		int i =word.length()-1;
		while(i>=0) {
			reversed += word.charAt(i);
			i--;
		}
		if(word.equals(reversed)) {
			System.out.println("is Palindrome");
		}else {
			System.out.println("Not Palindrome");
		}
	}

}
