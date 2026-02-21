package com.dsa;

public class binarysearch {
	public static void main(String[] args) {
		int [] arr = {10,30,50,70,90};
		int target=90;
		int low=0;
		int high =arr.length-1;
		while(low<=high) 
		{
			
			int mid = (low+high)/2;
			if (arr[mid]==target) {
				System.out.println("Element found at index " + mid);
				return;
			}
			else if(arr[mid]<target) 
			{
				low =mid+1;
			}else 
			{
				high=mid-1;
			}
		}
		System.out.println("Element not Found");
	}
}