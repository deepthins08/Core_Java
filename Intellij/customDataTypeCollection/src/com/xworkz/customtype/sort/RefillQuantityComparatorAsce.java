package com.xworkz.customtype.sort;

import com.xworkz.customtype.dto.RefillDTO;

import java.util.Comparator;

public class RefillQuantityComparatorAsce implements Comparator<RefillDTO> {
    @Override
    public int compare(RefillDTO o1, RefillDTO o2) {
        return Integer.compare(o1.getQuantity(),o2.getQuantity());
    }
}
