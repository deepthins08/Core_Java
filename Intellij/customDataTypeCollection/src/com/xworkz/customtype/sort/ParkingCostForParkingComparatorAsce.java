package com.xworkz.customtype.sort;

import com.xworkz.customtype.dto.ParkingDTO;

import java.util.Comparator;

public class ParkingCostForParkingComparatorAsce implements Comparator<ParkingDTO> {
    @Override
    public int compare(ParkingDTO o1, ParkingDTO o2) {
        return Double.compare(o1.getCostForParking(),o2.getCostForParking());
    }
}
