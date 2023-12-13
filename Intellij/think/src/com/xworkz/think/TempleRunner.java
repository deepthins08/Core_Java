package com.xworkz.think;

import com.xworkz.think.deepthi.TempleRuleImpl;

public class TempleRunner {
    public static void main(String[] args) {
        System.out.println("Starting main in TempleRunner");
        TempleRuleImpl templeRule=new TempleRuleImpl();
        templeRule.pujaRules();
        templeRule.neatness();
        templeRule.prasada();
        templeRule.restrictions();

        System.out.println("Ending main in TempleRunner");
    }
}
