package com.arrays;
import java.util.Scanner;
public class linearSearch {
	public static int linearSearch (int []arr,int target) {
		for(int i=0;i<arr.length;i++) {
			if(arr[i]==target) {
				return i;
			}
		}
				return -1;
			
		}
		
	public static void main(String [] args) {
		Scanner scanner = new Scanner(System.in);
		int arr[] = {23,45,56,67,42,50};
		System.out.println("Enter element to search: ");
		int target = scanner.nextInt();
		
		int result = linearSearch(arr,target);
		if(result!=-1) 
		{
			System.out.println("Element found at index : "+ result);
			
		}else
		{
			System.out.println("Element found at index"+result);
		}	
		scanner.close();
	}
}
