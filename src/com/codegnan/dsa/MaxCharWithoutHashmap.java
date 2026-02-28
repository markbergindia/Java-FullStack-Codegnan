package com.codegnan.dsa;

public class MaxCharWithoutHashmap {
	public static void main(String[] args) {
	String st = "success";
	int maxCount = 0;
	char maxChar = ' ';
	for(int i=0;i<st.length();i++)
	{
		int count = 1;
		for(int j=i+1;j<st.length();j++) 
		{
			if(st.charAt(i)==st.charAt(j))
			{
				count++;
			}
		}
		if(count > maxCount) {
			maxCount = count;
			maxChar = st.charAt(i);
			
		}
	}
	System.out.println("maximum occuring character: " + maxChar);
	System.out.println();
	System.out.println("maximum times occured : " + maxCount);
	
	
}
	

}
