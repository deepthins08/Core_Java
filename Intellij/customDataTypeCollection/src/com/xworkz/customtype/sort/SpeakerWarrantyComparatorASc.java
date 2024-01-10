package com.xworkz.customtype.sort;

import com.xworkz.customtype.dto.SpeakerDTO;

import java.util.Comparator;

public class SpeakerWarrantyComparatorASc implements Comparator<SpeakerDTO> {

    @Override
    public int compare(SpeakerDTO o1, SpeakerDTO o2) {
        return Integer.compare(o1.getWarranty(),o2.getWarranty());
    }
}
