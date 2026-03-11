package com.codegnan.dsa;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class SmallestLength {
	public static void main(String[] args) {
		List<String> words = new ArrayList(Arrays.asList("pie","apple","banana","kiwi"));
		words.sort((s1,s2)->{
			int diff=s2.length()-s1.length();
			if(diff!=0) {
				return diff;
			}else {
				return s1.compareTo(s2);
			}
		});
		System.out.println(words);
	}

}
