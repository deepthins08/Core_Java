package com.xworkz.customtype.sort;

import com.xworkz.customtype.dto.CoverDTO;

import java.util.Comparator;

public class CoverCostComparatorAsce implements Comparator<CoverDTO> {

    @Override
    public int compare(CoverDTO o1, CoverDTO o2) {
        return Double.compare(o1.getCost(), o2.getCost());
    }
}
