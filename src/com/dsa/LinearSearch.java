package com.dsa;

public class LinearSearch {
	public static void main(String [] args) {
		int arr [] = {56,89,14,69,66};
		int target = 66;
		int index=-1;
		for(int i=0;i<arr.length;i++) {
			if(arr[i]==target) {index=1;
			break;

			}
		}
		System.out.println(index!=1? "found":"notfound");
		
			
	}
	
}
