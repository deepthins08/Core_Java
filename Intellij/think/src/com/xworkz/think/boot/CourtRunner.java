package com.xworkz.think.boot;

import com.xworkz.think.deepthi.CourtRuleImpl;

public class CourtRunner {
    public static void main(String[] args) {
        System.out.println("Strating main in CourtRunner");

        CourtRuleImpl courtRule=new CourtRuleImpl();
        courtRule.judicialRules();;
        courtRule.rulesPassed();
        courtRule.protection();
        courtRule.violence();

        System.out.println("Ending main in CourtRunner");
    }
}
