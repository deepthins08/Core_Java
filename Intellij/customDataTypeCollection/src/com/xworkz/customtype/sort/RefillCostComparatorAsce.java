package com.xworkz.customtype.sort;

import com.xworkz.customtype.dto.RefillDTO;

import java.util.Comparator;

public class RefillCostComparatorAsce implements Comparator<RefillDTO> {
    @Override
    public int compare(RefillDTO o1, RefillDTO o2) {
        return Double.compare(o1.getCost(),o2.getCost());
    }
}
