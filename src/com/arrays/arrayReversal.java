package com.arrays;
import java.util.Scanner;
public class arrayReversal {
	
	private static void reverseArray(int arr[]) {
		int left = 0;
		int right = arr.length-1;
		while(left<right) {
			int temp = arr[left];
			arr[left] = arr[right];
			arr[right] = temp;
			right--;
			left++;
		}
	}
	public static void main(String [] args) {
		Scanner sc =new Scanner (System.in);
		System.out.println("Enter size of array : ");
		int size = sc.nextInt();
		int [] arr = new int [size];
		System.out.println("Enter " + size + " Elements: ");
		for(int i =0; i<size;i++) {
			arr[i]=sc.nextInt();
			
		}
		reverseArray(arr);
		System.out.println("Reversed Array: ");
		for(int num : arr) {		//enhanced loop
			System.out.print(num + " ");
		}
		sc.close();
	}

}
