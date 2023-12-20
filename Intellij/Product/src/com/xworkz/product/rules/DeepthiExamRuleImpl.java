package com.xworkz.product.rules;

public class DeepthiExamRuleImpl implements ExamRule{

    @Override
    public boolean name() {
        System.out.println("running the name in DeepthiExamRuleImpl");

        return true;
    }

    @Override
    public String hallTicket() {
        System.out.println("running the hallTicket in DeepthiExamRuleImpl");
        return "Approved";
    }
}
