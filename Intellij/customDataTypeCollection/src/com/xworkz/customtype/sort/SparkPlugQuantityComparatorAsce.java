package com.xworkz.customtype.sort;

import com.xworkz.customtype.dto.SparkPlugDTO;

import java.util.Comparator;

public class SparkPlugQuantityComparatorAsce implements Comparator<SparkPlugDTO> {
    @Override
    public int compare(SparkPlugDTO o1, SparkPlugDTO o2) {
        return Integer.compare(o1.getQuantity(), o2.getQuantity());
    }
}
