package com.xworkz.customtype.sort;

import com.xworkz.customtype.dto.CharcolDTO;

import java.util.Comparator;

public class CharcolQuantityComparatorDesc implements Comparator<CharcolDTO> {
    @Override
    public int compare(CharcolDTO o1, CharcolDTO o2) {
        return Integer.compare(o2.getQuantity(), o1.getQuantity());
    }
}
