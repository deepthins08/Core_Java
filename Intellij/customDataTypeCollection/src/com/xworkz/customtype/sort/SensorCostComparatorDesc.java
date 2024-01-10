package com.xworkz.customtype.sort;

import com.xworkz.customtype.dto.SensorDTO;

import java.util.Comparator;

public class SensorCostComparatorDesc implements Comparator<SensorDTO> {
    @Override
    public int compare(SensorDTO o1, SensorDTO o2) {
        return Double.compare(o2.getCost(),o1.getCost());
    }
}
