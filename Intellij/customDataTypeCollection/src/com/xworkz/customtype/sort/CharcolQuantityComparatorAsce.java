package com.xworkz.customtype.sort;

import com.xworkz.customtype.dto.CharcolDTO;

import java.util.Comparator;

public class CharcolQuantityComparatorAsce implements Comparator<CharcolDTO> {
    @Override
    public int compare(CharcolDTO o1, CharcolDTO o2) {
        return Integer.compare(o1.getQuantity(),o2.getQuantity());
    }
}
