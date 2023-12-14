package com.xworkz.elegent.boot;

import com.xworkz.elegent.rules.Contractor;
import com.xworkz.elegent.rules.MetroContractor;

public class ContractorsRunner {
    public static void main(String[] args) {
        System.out.println("Starting main in ContactorsRunner");

        Contractor contractor=new Contractor();
        contractor.adharCard();
        contractor.appointments();
        contractor.budget();
        contractor.panCard();
        contractor.roads();
        contractor.construction();
        contractor.dumping();
        contractor.pipeLines();


        MetroContractor metroContractor=new MetroContractor();
        metroContractor.collect();
        metroContractor.adharCard();
        metroContractor.dumping();
        metroContractor.budget();
        metroContractor.appointments();
        metroContractor.dustbin();
        metroContractor.construction();
        metroContractor.pipeLines();
        metroContractor.roads();
        metroContractor.panCard();

        System.out.println("Ending main in ContactorsRunner");
    }
}
