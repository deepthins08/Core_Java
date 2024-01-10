package com.xworkz.customtype.sort;

import com.xworkz.customtype.dto.PaperDTO;

import java.util.Comparator;

public class PaperColorComparatorAsce implements Comparator<PaperDTO> {

    @Override
    public int compare(PaperDTO o1, PaperDTO o2) {
        return o1.getColor().compareTo(o2.getColor());
    }
}
