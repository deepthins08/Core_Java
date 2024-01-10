package com.xworkz.customtype.sort;

import com.xworkz.customtype.dto.RefillDTO;

import java.util.Comparator;

public class RefillBrandComparatorAsce implements Comparator<RefillDTO> {
    @Override
    public int compare(RefillDTO o1, RefillDTO o2) {
        return o1.getBrand().compareTo(o2.getBrand());
    }
}
