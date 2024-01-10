package com.xworkz.customtype.sort;

import com.xworkz.customtype.dto.BeltDTO;

import java.util.Comparator;

public class BeltLengthComparatorAsce implements Comparator<BeltDTO> {
    @Override
    public int compare(BeltDTO o1, BeltDTO o2) {
        return Double.compare(o1.getLength(), o2.getLength());
    }
}
