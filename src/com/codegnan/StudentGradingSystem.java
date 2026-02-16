package com.codegnan;
import java.util.*;
import java.util.Scanner;
public class StudentGradingSystem{
	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter the number of students : ");
		int n=sc.nextInt();
		sc.nextLine();
		String names[]=new String[n];
		int[] totalMarks=new int[n];
		double[] percentage = new double[n];
		char[] grade = new char[n];
		
		double classTotalpercentage = 0;
		double classhighestpercentage = 0;
		int topperIndex =0;
		
		for(int i=0;i<n;i++) {
			System.out.println("Enter student details : "+ (i+1));
			System.out.print("Enter student name :");
			names[i]=sc.nextLine();
			System.out.println("Enter marks of sub1: ");
			int sub1=sc.nextInt();
			System.out.println("Enter marks of sub2: ");
			int sub2=sc.nextInt();
			System.out.println("Enter marks of sub3: ");
			int sub3=sc.nextInt();
			
			sc.nextLine();
			
			totalMarks[i]= sub1 + sub2 + sub3;
			percentage[i] = (totalMarks[i] / 300.0 )*100;
			
			
			if(percentage[i]>=90) {
				grade[i]='A';
			}else if(percentage[i]>=80) {
				grade[i]='B';
				
			}else if(percentage[i]>=75) {
				grade[i]='C';
			}else if(percentage[i]>=60) {
				grade[i]='D';
			}else if(percentage[i]>=50) {
				grade[i]='E';
			}else {
				grade[i]='F';
			}
			
			classTotalpercentage += percentage[i];
			
			
			if(percentage[i]>classhighestpercentage) {
				classhighestpercentage = percentage[i];
				topperIndex = i;
			}			
		}
		double classAverage = classTotalpercentage / n;
		
		//Display report 
		System.out.println(" CLASS STUDENTS RESULTS ")
;
		System.out.printf("%-20s %-15s %-15s %-10s\n", "Student Name", "Total Marks", "Percentage", "Grade");
		System.out.println();
		
		for(int i=0;i<n;i++) {
			System.out.printf("%-20s %-15d %-14f %-10c\n",
			        names[i], totalMarks[i], percentage[i], grade[i]);
		}
			System.out.println();
			System.out.println("Class Average percentage:" + classAverage);
			System.out.println();
			System.out.println(" Topper Student : "+ topperIndex);
			System.out.println();
			
			sc.close();
			
	}
}