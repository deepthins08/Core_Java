package com.xworkz.customtype.sort;

import com.xworkz.customtype.dto.WaterPurifierDTO;

import java.util.Comparator;

public class WaterPurifierColorComparatorAsc implements Comparator<WaterPurifierDTO> {

    @Override
    public int compare(WaterPurifierDTO o1, WaterPurifierDTO o2) {
        return o1.getColor().compareTo(o2.getColor());
    }
}
