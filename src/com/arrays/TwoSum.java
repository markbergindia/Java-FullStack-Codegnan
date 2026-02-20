package com.arrays;
public class TwoSum{
	
	
//	public static void main(String [] args) {
//		int [] arr = {2,5,6,7,9};
//		int target = 9;
//		for(int i=0;i<arr.length;i++) {
//			for(int j=i+1;j<arr.length;j++) {
//				if(arr[i]+arr[j]==target) {
//				System.out.println(arr[i]+ " "+arr[j]);
//				}
//			}
//		System.out.println();
//		}	                                                                   
//	}
	
	public static void main(String []args) {
		//two pointer appproach
		int [] arr = {2,4,5,7,8};
		int target=12;
		int left=arr[0];
		int right=arr.length-1;
		while(left<right){
			int sum1=arr[left]+arr[right];
			if (sum1==target) {
				System.out.println(arr[left]+ " "+arr[right]);
				left++;
				right--;
			}else if(sum1<target) {
				left++;
				System.out.println(arr[left]+ " "+arr[right]);
			}else {
				right--;
			}
			System.out.println();
		}	
	}	
}