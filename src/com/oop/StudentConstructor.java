//create an encapsulated student class with following attributes :
//1.name
//2.age
//create paramterized constructor and no argument constructor
// create accessors(getters) and mutators(setters)
//create the object of students
// validate the age of students:
// when age > 0 && age < 120; acccept the age,  or else show the message "invalid age"

package com.oop;
public class StudentConstructor {

    // Encapsulation (private variables)
    private String name;
    private int age;

    // No-Argument Constructor
    public StudentConstructor() {
        name = "Unknown";
        age = 0;
    }

    // Parameterized Constructor
    public StudentConstructor(String name, int age) {
        this.name = name;
        this.age = age;  // validation
    }
    // Getter for name
    public String getName() {
        return name;
    }

    // Setter for name
    public void setName(String name) {
        this.name = name;
    }

    // Getter for age
    
    public int getAge() {
        return age;
    }

    // Setter for age with validation
    public void setAge(int age) {
        if (age > 0 && age < 18) {
            this.age = age;
        } else {
            System.out.println("Invalid Age");
        }
    }
}
