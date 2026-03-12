package com.collectionsframework;

import java.util.ArrayList;
import java.util.Collections;

public class SortEmployee {

    public static void main(String[] args) {

        ArrayList<Integer> markslist = new ArrayList<>();
        markslist.add(10);
        markslist.add(20);
        markslist.add(30);
        markslist.add(40);

        Collections.sort(markslist);
        System.out.println(markslist);

        Employee emp1 = new Employee(100, "raj");

        ArrayList<Employee> employeeList = new ArrayList<>();
        employeeList.add(emp1);
        employeeList.add(new Employee(50, "ram"));
        employeeList.add(new Employee(75, "amit"));

        
        Collections.sort(employeeList, new NameComparator());
        System.out.println("Sorted by Name:");
        System.out.println(employeeList);

    
        Collections.sort(employeeList, new IdComparator());
        System.out.println("Sorted by ID:");
        System.out.println(employeeList);
    }
}