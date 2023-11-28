package com.xworkz.birds;

import com.xworkz.birds.hunter.Hunter;

public class BirdsRunner {

    public static void main(String... flying) {
        System.out.println("Starting main in BirdsRunner");
        Birds birds=new Birds();
        birds.show();
        birds.fly();
        birds.display();

        Hunter hunter=new Hunter();
        hunter.show();
        hunter.display();
        hunter.info();

        Parrot parrot=new Parrot();
        parrot.display();
        parrot.show();
        parrot.fly();

        System.out.println("Ending main in BirdsRunner");
    }
}
