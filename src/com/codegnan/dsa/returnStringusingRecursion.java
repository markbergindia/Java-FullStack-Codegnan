package com.codegnan.dsa;
public class returnStringusingRecursion {
	
	public static String reverse(String str) {
		if(str.isEmpty()) {
			return str;
		}
		return reverse(str.substring(1))+str.charAt(0);
		
	}
	public static void main(String[] args) {
		String s = "abcdefghijklmnopqrsrtuvwxyz";
		System.out.println(reverse(s));
	}

}
