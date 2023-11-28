package com.xworkz.birds.hunter;

import com.xworkz.birds.Birds;

public class Hunter extends Birds {

    public Hunter(){
        super.show();
        System.out.println("created no-arg const in Hunter");
    }
    public void info(){

        Birds birds=new Birds();
        birds.display();
        System.out.println("accessing only public as in diff package");
    }
}
