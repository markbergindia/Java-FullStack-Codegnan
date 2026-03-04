package com.codegnan.dsa;

public class StringContainsOnlyDigits {
	public static void main(String[] args) {
		String str = "1234";
		boolean isDigit = true;
		for(int i=0;i<str.length();i++) {
			if(!Character.isDigit(str.charAt(i))) {
				isDigit = false;
				break;
			}
		}
		if(isDigit) {
			System.out.println("Contains Digits");
		}else {
			System.out.println("not Contain Digits");
		}
		
	}

}
