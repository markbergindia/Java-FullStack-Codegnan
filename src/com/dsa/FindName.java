package com.dsa;

public class FindName {
	public static void main(String [] args) {
		String arr[]= {"bahu","ball","deas","sena"};
		String target="kattapa";
		boolean found=false;
		  
		
		for(String name:arr) {
			if(name.equals(target)) {
				found=true;
				break;
			}
		}
		System.out.println(found?"present ":"absent");
	}

}
