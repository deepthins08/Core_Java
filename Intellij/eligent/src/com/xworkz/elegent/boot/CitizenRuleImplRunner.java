package com.xworkz.elegent.boot;

import com.xworkz.elegent.rules.CitizenRule;
import com.xworkz.elegent.rules.CitizenRuleImpl;

public class CitizenRuleImplRunner {
    public static void main(String[] args) {
        System.out.println("Starting main in CitizenRuleImplRunner");

        CitizenRuleImpl citizenRule=new CitizenRuleImpl();
        citizenRule.signalJump();
        citizenRule.voterId();
        citizenRule.validLicense();
        citizenRule.nri();
        citizenRule.marksCard();

        CitizenRule citizenRule1=(CitizenRule)citizenRule;
        citizenRule1.voterId();
        citizenRule1.signalJump();;
        citizenRule1.validLicense();
        citizenRule1.nri();
        citizenRule1.marksCard();

        Object object=(Object)citizenRule;





        System.out.println("Ending main in CitizenRuleImplRunner");
    }
}
