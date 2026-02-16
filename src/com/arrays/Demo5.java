// findOut a target in given array , array passing to method
package com.arrays;
public class Demo5{
	public int findIndex(int arr[],int target) 
	{
		
	
		for(int i=0;i<arr.length;i++) 
		{
			if(arr[i]==target)
			{
				return i;
			}
		}
		return -1;
	}
public static void main(String[] args) {
		int arr[] = {12,18,45,89,78,46};
		Demo5 fd= new Demo5();
		System.out.println(fd.findIndex(arr, 89));
}
}