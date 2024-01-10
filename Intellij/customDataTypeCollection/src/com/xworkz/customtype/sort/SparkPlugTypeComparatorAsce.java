package com.xworkz.customtype.sort;

import com.xworkz.customtype.dto.SparkPlugDTO;

import java.util.Comparator;

public class SparkPlugTypeComparatorAsce implements Comparator<SparkPlugDTO> {
    @Override
    public int compare(SparkPlugDTO o1, SparkPlugDTO o2) {
        return o1.getType().compareTo(o2.getType());
    }
}
