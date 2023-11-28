package com.xworkz.birds;

public class Parrot extends Birds{

    public Parrot(){

        System.out.println("Created no arg const in Parrot");
    }

    void displayInfo(){

        display();
        show();
        fly();
        System.out.println("Accessing only public,protected, package-deafault as in Parrot with in the same package dif class");
    }
}
