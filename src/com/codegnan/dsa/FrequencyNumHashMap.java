package com.codegnan.dsa;

import java.util.HashMap;
import java.util.Map;

public class FrequencyNumHashMap {
	public static void main(String[] args) {
		int arr[] = {1,2,3,1,2,3,1,2};
		Map<Integer,Integer> map = new HashMap();
		
		for(int num : arr) {
			map.put(num, map.getOrDefault(num, 0)+1);
		}
		
		for(Map.Entry<Integer, Integer>entry:map.entrySet()) {
			System.out.println("number: "+ entry.getKey()+ " appears : "+entry.getValue());
		}
	}

}
