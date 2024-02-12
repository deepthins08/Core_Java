package com.xworkz.comparable.boot;

import com.xworkz.comparable.dto.DiseaseDTO;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

public class DiseaseRunner {
    public static void main(String[] args) {

        DiseaseDTO diseaseDTO=new DiseaseDTO("Fever","viral flue","high temparature","verotica");
        DiseaseDTO diseaseDTO1=new DiseaseDTO("Cough","flue","throat ","merlin");
        DiseaseDTO diseaseDTO2=new DiseaseDTO("Cold","viral flue","Running nose","Tylor");
        DiseaseDTO diseaseDTO3=new DiseaseDTO("Headache","normal","head ache","steve");
        DiseaseDTO diseaseDTO4=new DiseaseDTO("stomach pain","ulcer","pain in stomach","stephene");

        List<DiseaseDTO> list=new ArrayList<>();
        list.add(diseaseDTO);
        list.add(diseaseDTO1);
        list.add(diseaseDTO2);
        list.add(diseaseDTO3);
        list.add(diseaseDTO4);

        Collections.sort(list);
        list.forEach(l-> System.out.println(l));

        System.out.println("-----------------------------------------------");
        System.out.println("Ascending by name");

        Collections.sort(list,(p1,p2)->p1.getName().compareTo(p2.getName()));
        list.forEach(l-> System.out.println(l));

        System.out.println("Descending by name");
        Collections.sort(list,(p1,p2)->p2.getName().compareTo(p1.getName()));
        list.forEach(l-> System.out.println(l));

        System.out.println("Ascending by type");
        Collections.sort(list,(p1,p2)->p1.getType().compareTo(p2.getType()));
        list.forEach(l-> System.out.println(l));
        System.out.println("Descending by type");
        Collections.sort(list,(p1,p2)->p2.getType().compareTo(p1.getType()));
        list.forEach(l-> System.out.println(l));

        System.out.println("Ascending by symptom");
        Collections.sort(list,(p1,p2)->p1.getSymptom().compareTo(p2.getSymptom()));
        list.forEach(l-> System.out.println(l));
        System.out.println("Descending by symptom");
        Collections.sort(list,(p1,p2)->p2.getSymptom().compareTo(p1.getSymptom()));
        list.forEach(l-> System.out.println(l));
    }
}
