package com.xworkz.customtype.sort;

import com.xworkz.customtype.dto.PaperDTO;

import java.util.Comparator;

public class PaperSizeComparatorAsce implements Comparator<PaperDTO> {
    @Override
    public int compare(PaperDTO o1, PaperDTO o2) {
        return Double.compare(o1.getSize(),o2.getSize());
    }
}
