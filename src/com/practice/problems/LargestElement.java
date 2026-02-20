package com.practice.problems;

import java.util.Arrays;
public class LargestElement{
	public static void main(String [] args) {
		
		
//		sorting method		
//		int [] arr = {8,6,1,2,5,45};
//		Arrays.sort(arr);
//		System.out.println("largest Element is : "+ arr[arr.length-1]);
		
		
		int [] arr = {23,56,2,67,3,4};
		int largest = arr[0];
		for(int i=1;i<arr.length;i++) {
			if (arr[i]>largest){
				largest=arr[i];
			}			
		}
		System.out.println("largest Element is : "+ largest);
	}
}