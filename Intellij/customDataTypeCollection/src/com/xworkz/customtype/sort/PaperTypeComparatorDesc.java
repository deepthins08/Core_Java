package com.xworkz.customtype.sort;

import com.xworkz.customtype.dto.PaperDTO;

import java.util.Comparator;

public class PaperTypeComparatorDesc implements Comparator<PaperDTO> {

    @Override
    public int compare(PaperDTO o1, PaperDTO o2) {
        return o2.getType().compareTo(o1.getType());
    }
}
