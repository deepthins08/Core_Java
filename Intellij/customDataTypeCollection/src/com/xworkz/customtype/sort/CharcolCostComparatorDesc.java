package com.xworkz.customtype.sort;

import com.xworkz.customtype.dto.CharcolDTO;

import java.util.Comparator;

public class CharcolCostComparatorDesc implements Comparator<CharcolDTO> {
    @Override
    public int compare(CharcolDTO o1, CharcolDTO o2) {
        return Double.compare(o2.getCost(),o2.getCost());
    }
}
