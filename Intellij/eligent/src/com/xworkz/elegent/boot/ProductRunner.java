package com.xworkz.elegent.boot;

import com.xworkz.elegent.rules.AllRuleImpl;
import com.xworkz.elegent.rules.DeliveryRule;
import com.xworkz.elegent.rules.SellerRule;

public class ProductRunner {
    public static void main(String[] args) {
        System.out.println("Starting main in ProductRunner");

        Object object=new AllRuleImpl();

        AllRuleImpl allRule=new AllRuleImpl();
        allRule.damaged();
        allRule.packed();
        allRule.replacement();
        allRule.deliveryCharges();

        DeliveryRule deliveryRule=new AllRuleImpl();
        deliveryRule.damaged();
        deliveryRule.packed();

        SellerRule sellerRule=new AllRuleImpl();
        sellerRule.replacement();
        sellerRule.deliveryCharges();

        System.out.println("Ending main in ProductRunner");
    }
}
