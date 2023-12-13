package com.xworkz.think.deepthi;

public class TempleRuleImpl implements TempleRule{

    @Override
    public void neatness() {
        System.out.println("evryone should be keep clean in temple around");
    }

    @Override
    public void pujaRules() {
        System.out.println("Only pujaris will do puja outsiders are not allowed to do");
    }

    @Override
    public void restrictions() {
        System.out.println("slippers should be kept outside the temple");
    }

    @Override
    public boolean prasada() {
        System.out.println("prasada will be given only once in a week");
        return false;
    }
}
