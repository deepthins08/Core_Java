package com.xworkz.customtype.sort;

import com.xworkz.customtype.dto.PaperDTO;

import java.util.Comparator;

public class PaperTypeComapratorAsce implements Comparator<PaperDTO> {
    @Override
    public int compare(PaperDTO o1, PaperDTO o2) {
        return o1.getType().compareTo(o2.getType());
    }
}
