package com.codegnan.dsa;

public class ReverseStirng {
	public static void main(String[] args) {
		String str = "markberg";
		String reverse = "";
		
		for(int i =str.length()-1;i>=0;i--) {
			reverse +=str.charAt(i);
		}
		System.out.println("ReverseString: " + reverse);
		
	}

}
