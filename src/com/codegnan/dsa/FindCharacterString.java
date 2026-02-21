package com.codegnan.dsa;

public class FindCharacterString {
	public static void main(String[] args) {
		String name="sriram";
		char target='m';
		for(int i=0;i<name.length();i++) {
			if(name.charAt(i)==target) {
				System.out.println("found Index :" + i);
				return;
			}
		}
		System.out.println("no index found");
	}

}
