package com.xworkz.customtype.sort;

import com.xworkz.customtype.dto.ParkingDTO;

import java.util.Comparator;

public class ParkingPlaceNameComparatorDesc implements Comparator<ParkingDTO> {
    @Override
    public int compare(ParkingDTO o1, ParkingDTO o2) {
        return o2.getPlaceName().compareTo(o1.getPlaceName());
    }
}
