package com.xworkz.customtype.sort;

import com.xworkz.customtype.dto.SensorDTO;

import java.util.Comparator;

public class SensorTypeComparatorDesc implements Comparator<SensorDTO> {
    @Override
    public int compare(SensorDTO o1, SensorDTO o2) {
        return o2.getType().compareTo(o1.getType());
    }
}
