package com.xworkz.think.boot;

import com.xworkz.think.deepthi.HospitalRuleImpl;

public class HospitalRunner {
    public static void main(String[] args) {
        System.out.println("Starting main in HospitalRunner");

        HospitalRuleImpl hospitalRule=new HospitalRuleImpl();
        hospitalRule.icuEntry();
        hospitalRule.restrictions();
        hospitalRule.talkingLoudly();
        hospitalRule.organizing();

        System.out.println("Ending main in HospitalRunner");
    }
}
