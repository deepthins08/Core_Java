package com.xworkz.customtype.sort;

import com.xworkz.customtype.dto.SpeakerDTO;

import java.util.Comparator;

public class SpeakerCostComparatorAsc implements Comparator<SpeakerDTO> {
    @Override
    public int compare(SpeakerDTO o1, SpeakerDTO o2) {
        return Double.compare(o1.getCost(),o2.getCost());
    }
}
