package com.xworkz.customtype.sort;

import com.xworkz.customtype.dto.CoverDTO;

import java.util.Comparator;

public class CoverColorComparatorAsce implements Comparator<CoverDTO> {
    @Override
    public int compare(CoverDTO o1, CoverDTO o2) {
        return o1.getColor().compareTo(o2.getColor());
    }
}
