package com.xworkz.customtype.sort;

import com.xworkz.customtype.dto.CharcolDTO;

import java.util.Comparator;

public class CharcolBrandComparatorDesc implements Comparator<CharcolDTO> {

    @Override
    public int compare(CharcolDTO o1, CharcolDTO o2) {
        return o2.getBrand().compareTo(o1.getBrand());
    }
}
