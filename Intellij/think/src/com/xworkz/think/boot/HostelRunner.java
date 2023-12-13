package com.xworkz.think.boot;

import com.xworkz.think.deepthi.HostelRuleImpl;

public class HostelRunner {
    public static void main(String[] args) {
        System.out.println("starting main in HostelRunner");
        HostelRuleImpl hostelRule=new HostelRuleImpl();
        hostelRule.partiesAllowed();
        hostelRule.changingRooms();
        hostelRule.abusing();
        hostelRule.safety();

        System.out.println("Ending main in HostelRunner");
    }

}
