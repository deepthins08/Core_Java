package com.xworkz.birds;

public class Birds {

    public Birds(){
        System.out.println("Running no-arg const in bird using public ");
    }

    public void display(){
        System.out.println("Displaying birds in display using public");
    }

    protected void show(){
        System.out.println("Displaying birds in show using protected");
    }

    void fly(){
        System.out.println("Displaying birds in fly using package-default");
    }

    private void wings(){
        System.out.println("Displaying birds in wings using private");
    }


}
