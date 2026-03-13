package SortingStudentsUsingComparator;

import java.util.ArrayList;
import java.util.Collections;

public class SortStudents {
	public static void main(String[] args) {
		ArrayList <Student> markslist = new ArrayList();
		markslist.add(new Student(1,"sriram",94.2));
		markslist.add(new Student(2,"markberg",80.3));
		markslist.add(new Student(3,"bucks",75.5));
		markslist.add(new Student(4,"srinadh",86));
		
		System.out.println("marks: ");
		System.out.println(markslist);
		
		Collections.sort(markslist,new StudentIdComparator());
		System.out.print("Sorted According to ID: ");
		System.out.println(markslist);
		
		Collections.sort(markslist,new StuedntNameComparator());
		System.out.print("Sorted According to Name: ");
		System.out.println(markslist);
		
		Collections.sort(markslist,new StudentMarksComparator());
		System.out.print("Sorted According to Marks: ");
		System.out.println(markslist);
		
		Collections.sort(markslist,new StudentMarksComparator().reversed());
		System.out.print("Sorted According to Marks in descending order: ");
		System.out.println(markslist);
	}
	

}
