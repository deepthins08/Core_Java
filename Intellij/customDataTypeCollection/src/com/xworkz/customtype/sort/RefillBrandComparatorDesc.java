package com.xworkz.customtype.sort;

import com.xworkz.customtype.dto.RefillDTO;

import java.util.Comparator;

public class RefillBrandComparatorDesc implements Comparator<RefillDTO> {
    @Override
    public int compare(RefillDTO o1, RefillDTO o2) {
        return o2.getBrand().compareTo(o1.getBrand());
    }
}
