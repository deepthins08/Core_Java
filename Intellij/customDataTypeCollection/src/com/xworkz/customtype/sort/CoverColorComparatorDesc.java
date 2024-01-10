package com.xworkz.customtype.sort;

import com.xworkz.customtype.dto.CoverDTO;

import java.util.Comparator;

public class CoverColorComparatorDesc implements Comparator<CoverDTO> {
    @Override
    public int compare(CoverDTO o1, CoverDTO o2) {
        return o2.getColor().compareTo(o1.getColor());
    }
}
