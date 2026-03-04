package com.codegnan.dsa;

public class CountWordsInString {
	public static void main(String[] args) {
		String str = "programming is very easy";
		int count = 1;
		for(int i=0;i<str.length();i++) {
			if(str.charAt(i)==' ') {
				count++;
			}
		}
		System.out.println(count);
				
	}

}
