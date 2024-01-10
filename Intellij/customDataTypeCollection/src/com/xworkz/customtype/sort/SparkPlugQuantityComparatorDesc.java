package com.xworkz.customtype.sort;

import com.xworkz.customtype.dto.SparkPlugDTO;

import java.util.Comparator;

public class SparkPlugQuantityComparatorDesc implements Comparator<SparkPlugDTO> {
    @Override
    public int compare(SparkPlugDTO o1, SparkPlugDTO o2) {
        return Integer.compare(o2.getQuantity(),o1.getQuantity());
    }
}
