package com.xworkz.customtype.sort;

import com.xworkz.customtype.dto.ParkingDTO;

import java.util.Comparator;

public class ParkingNoOfParkedVehiclesComparatorAsce implements Comparator<ParkingDTO> {
    @Override
    public int compare(ParkingDTO o1, ParkingDTO o2) {
        return Integer.compare(o1.getNoOfParkedVehicles(),o2.getNoOfParkedVehicles());
    }
}
