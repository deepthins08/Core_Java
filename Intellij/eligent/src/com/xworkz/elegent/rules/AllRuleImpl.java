package com.xworkz.elegent.rules;

public class AllRuleImpl implements DeliveryRule, SellerRule{

    @Override
    public boolean damaged() {
        return false;
    }

    @Override
    public int packed() {
        return 10;
    }

    @Override
    public boolean replacement() {

       return false;
    }

    @Override
    public double deliveryCharges() {
        return 100;
    }
}
