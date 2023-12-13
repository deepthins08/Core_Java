package com.xworkz.think.deepthi;

public class HostelRuleImpl implements HostelRule{

    @Override
    public boolean partiesAllowed() {
        System.out.println("parties are not allowed");
        return false;
    }

    @Override
    public void changingRooms() {
        System.out.println("there is no changing in rooms");
    }

    @Override
    public void abusing() {
        System.out.println("abusing is prhibited");
    }

    @Override
    public void safety() {
        System.out.println("safety will be provided for the sudents");
    }
}
