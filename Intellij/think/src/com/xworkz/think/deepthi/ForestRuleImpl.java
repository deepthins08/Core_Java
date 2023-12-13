package com.xworkz.think.deepthi;

public class ForestRuleImpl implements ForestRule{

    @Override
    public void cuttingTrees() {
        System.out.println("cutting trees without permission is illegal");
    }

    @Override
    public void protectingAnimals() {
        System.out.println("forest animals are to be protected from the hunters");
    }

    @Override
    public void planting() {
        System.out.println("every year planation will take place");
    }

    @Override
    public void tourism() {
        System.out.println("tourism available");
    }
}
