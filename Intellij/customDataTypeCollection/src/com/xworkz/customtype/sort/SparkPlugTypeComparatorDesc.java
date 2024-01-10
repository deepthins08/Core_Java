package com.xworkz.customtype.sort;

import com.xworkz.customtype.dto.SparkPlugDTO;

import java.util.Comparator;

public class SparkPlugTypeComparatorDesc implements Comparator<SparkPlugDTO> {
    @Override
    public int compare(SparkPlugDTO o1, SparkPlugDTO o2) {
        return o2.getType().compareTo(o1.getType());
    }
}
