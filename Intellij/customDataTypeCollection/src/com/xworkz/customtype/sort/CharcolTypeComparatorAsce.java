package com.xworkz.customtype.sort;

import com.xworkz.customtype.dto.CharcolDTO;

import java.util.Comparator;

public class CharcolTypeComparatorAsce implements Comparator<CharcolDTO> {
    @Override
    public int compare(CharcolDTO o1, CharcolDTO o2) {
        return o1.getType().compareTo(o2.getType());
    }
}
