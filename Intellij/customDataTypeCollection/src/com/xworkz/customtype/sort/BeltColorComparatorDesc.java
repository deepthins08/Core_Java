package com.xworkz.customtype.sort;

import com.xworkz.customtype.dto.BeltDTO;

import java.util.Comparator;

public class BeltColorComparatorDesc implements Comparator<BeltDTO> {
    @Override
    public int compare(BeltDTO o1, BeltDTO o2) {
        return o2.getColor().compareTo(o1.getColor());
    }
}
