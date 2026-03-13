package SortingStudentsUsingComparator;

import java.util.Comparator;

public class StudentMarksComparator implements Comparator<Student>{

	@Override
	public int compare(Student s1, Student s2) {
		
		return Double.compare(s1.marks,s2.marks);
	}
	

}
