package com.sorting;

import java.util.Arrays;

public class SortEvenNumbers{
	public static void main(String[] args) {
		int [] arr = {2,3,45,56,2,8,10};
		int count = 0;
		for(int num : arr) {
			if(num%2==0) {
				count++;
			}
		}
		int [] even = new int[count];
		int index= 0;
		
		for(int num : arr) {
			if (num % 2 == 0) {
				even[index++]=num;
			}
		}
		
		Arrays.sort(even);
		System.out.println("sort of even numbers: "+ Arrays.toString(even));
	}
}
