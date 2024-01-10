package com.xworkz.customtype.sort;

import com.xworkz.customtype.dto.WaterPurifierDTO;

import java.util.Comparator;

public class WaterPurifierCostComparatorAsc implements Comparator<WaterPurifierDTO> {
    @Override
    public int compare(WaterPurifierDTO o1, WaterPurifierDTO o2) {
        return Double.compare(o1.getCost(),o2.getCost());
    }
}
