package com.xworkz.product.runner;

import com.xworkz.product.rules.DeepthiExamRuleImpl;
import com.xworkz.product.rules.Evaluvator;
import com.xworkz.product.rules.ExamRule;

public class ExamRuleRunner {

    public static void main(String[] args) {

        ExamRule examRule=new DeepthiExamRuleImpl();
        Evaluvator evaluvator=new Evaluvator(examRule);
        evaluvator.evalutaing();

    }
}
