package com.xworkz.customtype.sort;

import com.xworkz.customtype.dto.BeltDTO;

import java.util.Comparator;

public class BeltLengthComparatorDesc implements Comparator<BeltDTO> {
    @Override
    public int compare(BeltDTO o1, BeltDTO o2) {
        return Double.compare(o2.getLength(),o1.getLength());
    }
}
