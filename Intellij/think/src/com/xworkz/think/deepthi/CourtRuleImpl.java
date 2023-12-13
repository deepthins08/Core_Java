package com.xworkz.think.deepthi;

public class CourtRuleImpl implements CourtRule{

    @Override
    public void rulesPassed() {
        System.out.println(" the people should follow the rules passed by the court");
    }

    @Override
    public void violence() {
        System.out.println("in the court area violence is prohibited");
    }

    @Override
    public void protection() {
        System.out.println("court will be gaurded by the pilices");
    }

    @Override
    public void judicialRules() {
        System.out.println("judicial rules should be followed by everyone");
    }
}
