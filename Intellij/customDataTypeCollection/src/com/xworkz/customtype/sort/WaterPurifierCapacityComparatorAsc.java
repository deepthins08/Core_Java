package com.xworkz.customtype.sort;

import com.xworkz.customtype.dto.WaterPurifierDTO;

import java.util.Comparator;

public class WaterPurifierCapacityComparatorAsc implements Comparator<WaterPurifierDTO> {
    @Override
    public int compare(WaterPurifierDTO o1, WaterPurifierDTO o2) {
        return Integer.compare(o1.getCapacity(),o2.getCapacity());
    }
}
