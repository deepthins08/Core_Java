package com.xworkz.customtype.sort;

import com.xworkz.customtype.dto.CharcolDTO;

import java.util.Comparator;

public class CharcolTypeComparatorDesc implements Comparator<CharcolDTO> {
    @Override
    public int compare(CharcolDTO o1, CharcolDTO o2) {
        return o2.getType().compareTo(o1.getType());
    }
}
