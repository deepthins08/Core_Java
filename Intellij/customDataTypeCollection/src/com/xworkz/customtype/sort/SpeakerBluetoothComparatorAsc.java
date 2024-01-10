package com.xworkz.customtype.sort;

import com.xworkz.customtype.dto.SpeakerDTO;

import java.util.Comparator;

public class SpeakerBluetoothComparatorAsc implements Comparator<SpeakerDTO> {
    @Override
    public int compare(SpeakerDTO o1, SpeakerDTO o2) {
        return Boolean.compare(o1.isBluetooth(),o2.isBluetooth());
    }
}
