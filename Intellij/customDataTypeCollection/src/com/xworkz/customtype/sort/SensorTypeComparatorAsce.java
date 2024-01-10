package com.xworkz.customtype.sort;

import com.xworkz.customtype.dto.SensorDTO;

import java.util.Comparator;

public class SensorTypeComparatorAsce implements Comparator<SensorDTO> {
    @Override
    public int compare(SensorDTO o1, SensorDTO o2) {
        return o1.getType().compareTo(o2.getName());
    }
}
