package com.xworkz.collection.comparator;

import java.util.Comparator;

public class TollComparatordesc implements Comparator<Double> {

    @Override
    public int compare(Double o1, Double o2) {

        int no=o2.compareTo(o1);
        return no;
    }
}
