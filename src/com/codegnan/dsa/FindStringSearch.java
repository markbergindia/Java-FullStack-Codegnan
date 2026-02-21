package com.codegnan.dsa;

public class FindStringSearch {
	public static void main(String[] args) {
		String arr[] = {"apple","ball","cat","watch"};
		
		String target="watch";
		int low =0 ;
		int high=arr.length-1;
	
		while(low<=high)
		{
			int mid=(low+high)/2;
			int comp=arr[mid].compareTo(target);
			if (comp == 0){
				System.out.println("found at : " + mid);
				return ;
			}
			else if (comp < 0){
				low=mid+1;
			}else {
				high = mid -1;
			}
		}
		System.out.println("Element not found");
	}
}