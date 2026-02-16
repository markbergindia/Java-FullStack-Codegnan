package com.arrays;
public class Demo3{
	public static void main(String[] args) {
		int nums[][] = {{12},{78,45},{16,38,93}};
		for(int i=0;i<nums.length;i++) {
			for(int j=0;j<nums[i].length;j++){
				System.out.print(nums[i][j]+" ");
			}
			System.out.println();
		}
		
	}
}