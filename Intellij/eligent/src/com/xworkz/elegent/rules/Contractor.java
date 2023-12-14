package com.xworkz.elegent.rules;

public class Contractor extends AbstractSewageRule implements BbmpRule{

    @Override
    public boolean construction() {
        return false;
    }

    @Override
    public String roads() {
        return null;
    }

    @Override
    public int budget() {
        return 0;
    }

    @Override
    public boolean appointments() {
        return false;
    }

    @Override
    public boolean adharCard() {
        return false;
    }

    @Override
    public boolean panCard() {
        return false;
    }
}
