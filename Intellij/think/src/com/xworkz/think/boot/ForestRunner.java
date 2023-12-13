package com.xworkz.think.boot;

import com.xworkz.think.deepthi.ForestRule;
import com.xworkz.think.deepthi.ForestRuleImpl;

public class ForestRunner {
    public static void main(String[] args) {
        System.out.println("Starting main in ForestRunner");
        ForestRuleImpl forestRule=new ForestRuleImpl();
        forestRule.cuttingTrees();
        forestRule.protectingAnimals();
        forestRule.planting();
        forestRule.tourism();

        System.out.println("Ending main in ForestRunner");
    }
}
