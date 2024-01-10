package com.xworkz.customtype.sort;

import com.xworkz.customtype.dto.BeltDTO;

import java.util.Comparator;

public class BeltSizeComparatorDesc implements Comparator<BeltDTO> {
    @Override
    public int compare(BeltDTO o1, BeltDTO o2) {
        return Integer.compare(o2.getSize(),o1.getSize());
    }
}
