package com.xworkz.elegent.rules;

public class MetroContractor extends Contractor implements GarbageRule{

    @Override
    public boolean collect() {
        return false;
    }

    @Override
    public String dustbin() {
        return null;
    }
}
