package com.codegnan.dsa;
import java.util.Arrays;
															
public class LargestNumber {			    				
    public static void main(String[] args) {	

        int[] nums = {3, 30, 34, 5, 9,2};

        String[] arr = new String[nums.length];

        for(int i = 0; i < nums.length; i++) {
            arr[i] = String.valueOf(nums[i]);
        }
        Arrays.sort(arr, (a, b) -> (b + a).compareTo(a + b));

        String result = "";

        for(String s : arr) {
            result += s;
        }
        System.out.println(result);
    }
}