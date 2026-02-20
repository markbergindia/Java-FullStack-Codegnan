package com.practice.problems;

public class CheckArrayIsSorted{
	public static void main(String[] args) {
		int [] arr= {5,6,8,9,78,444};
		boolean isSorted = true;
		for(int i=0;i<arr.length-1;i++) {
			if(arr[i]>arr[i+1] ){
				isSorted=false;
				break;
			}
			
			
			
		}
		if(isSorted) {
			System.out.println("Sorted array");
		}else {
			System.out.println("array Not sorted");
		}
		
		
	}
}