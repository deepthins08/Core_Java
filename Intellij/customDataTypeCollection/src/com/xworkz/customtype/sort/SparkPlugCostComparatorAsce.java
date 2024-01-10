package com.xworkz.customtype.sort;

import com.xworkz.customtype.dto.SparkPlugDTO;

import java.util.Comparator;

public class SparkPlugCostComparatorAsce implements Comparator<SparkPlugDTO> {
    @Override
    public int compare(SparkPlugDTO o1, SparkPlugDTO o2) {
        return Double.compare(o1.getCost(),o2.getCost());
    }
}
