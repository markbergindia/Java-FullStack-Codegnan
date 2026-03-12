package com.collectionsframework;

import java.util.Comparator;

public class IdComparator implements Comparator<Employee>{

    @Override
    public int compare(Employee e1, Employee e2) {
        return e1.id - e2.id;
    }

}