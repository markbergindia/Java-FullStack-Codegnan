package com.oop.abstraction;

public class Main {
    public static void main(String[] args) {
        
        Animal dog = new Dog();
        dog.makeSound();   // Dog Barks
        dog.sleep();       // animal sleeps
        
        System.out.println();
        
        Animal cat = new Cat();
        cat.makeSound();   // cat meows
        cat.sleep();       // animal sleeps
    }
}