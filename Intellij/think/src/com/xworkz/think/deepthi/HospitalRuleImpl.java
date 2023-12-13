package com.xworkz.think.deepthi;

public class HospitalRuleImpl implements HospitalRule{

    @Override
    public void icuEntry() {
        System.out.println("except doctors and nurses no one allowed");
    }

    @Override
    public void restrictions() {
        System.out.println("except hospital staff others are restricted to touch the equipments");

    }

    @Override
    public void talkingLoudly() {
        System.out.println("talking loudly in the hospital is restricted");
    }

    @Override
    public void organizing() {
        System.out.println("hospital should be well organized");
    }
}
