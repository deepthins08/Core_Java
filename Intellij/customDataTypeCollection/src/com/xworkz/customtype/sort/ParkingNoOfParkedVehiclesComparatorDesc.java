package com.xworkz.customtype.sort;

import com.xworkz.customtype.dto.ParkingDTO;

import java.util.Comparator;

public class ParkingNoOfParkedVehiclesComparatorDesc implements Comparator<ParkingDTO> {
    @Override
    public int compare(ParkingDTO o1, ParkingDTO o2) {
        return Integer.compare(o2.getNoOfParkedVehicles(),o1.getNoOfParkedVehicles());
    }
}
