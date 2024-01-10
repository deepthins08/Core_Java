package com.xworkz.customtype.sort;

import com.xworkz.customtype.dto.WaterPurifierDTO;

import java.util.Comparator;

public class WaterPurifierNameComparatorDesc implements Comparator<WaterPurifierDTO> {
    @Override
    public int compare(WaterPurifierDTO o1, WaterPurifierDTO o2) {
        return o2.getName().compareTo(o1.getName());
    }
}
