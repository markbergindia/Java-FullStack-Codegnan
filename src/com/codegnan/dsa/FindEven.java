package com.codegnan.dsa;

public class FindEven {
	public static void main(String [] args) {
		int arr[]= {89,35,28,35,34};
		
		for (int nums :arr) {			//enhanced for loop
			if(nums%2==0) {
				System.out.println("found even " + nums);
				return;
				
				
			}
			
		}
		System.out.println("no even found....");
	}

}
