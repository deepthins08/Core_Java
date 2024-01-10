package com.xworkz.customtype.sort;

import com.xworkz.customtype.dto.SensorDTO;

import java.util.Comparator;

public class SensorDistanceComparatorDesc implements Comparator<SensorDTO> {
    @Override
    public int compare(SensorDTO o1, SensorDTO o2) {
        return Integer.compare(o2.getDistance(), o1.getDistance());
    }
}
