package com.xworkz.elegent.rules;

public class CitizenRuleImpl implements CitizenRule{

    @Override
    public String voterId() {
        return null;
    }

    @Override
    public boolean marksCard() {
        return false;
    }

    @Override
    public boolean nri() {
        return false;
    }

    @Override
    public void signalJump() {
        System.out.println("dont jump on the sinal");
    }

    @Override
    public long validLicense() {
        return 0;
    }
}
