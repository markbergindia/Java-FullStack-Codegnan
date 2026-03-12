package com.collectionsframework;

public class Employeee {

    int id;
    String name;

    Employeee(int id, String name){
        this.id = id;
        this.name = name;
    }

    public String toString() {
        return id + " " + name;
    }
}