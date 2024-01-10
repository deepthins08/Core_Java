package com.xworkz.customtype.sort;

import com.xworkz.customtype.dto.CoverDTO;

import java.util.Comparator;

public class CoverThicknessComparatorAsce implements Comparator<CoverDTO> {
    @Override
    public int compare(CoverDTO o1, CoverDTO o2) {
        return Boolean.compare(o1.isThickness(),o2.isThickness());
    }
}
