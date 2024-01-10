package com.xworkz.customtype.sort;

import com.xworkz.customtype.dto.SpeakerDTO;

import java.util.Comparator;

public class SpeakerNameComparatorDesc implements Comparator<SpeakerDTO> {

    @Override
    public int compare(SpeakerDTO o1, SpeakerDTO o2) {
        return o2.getName().compareTo(o1.getName());
    }
}
