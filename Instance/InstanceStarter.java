class InstanceStarter{
	
	public static void main(String[] instance){
		
		System.out.println("Starting main in InstanceStarter");
		
		Train train=new Train();
		System.out.println("First time Instantiating from Train ");
		System.out.println(train.fromLocation);
		System.out.println(train.toDestination);
		System.out.println(train.noOfCompartments);
		System.out.println(train.lengthInMeters);
		System.out.println(train.noOfCoaches);
		System.out.println("\n");
		
		Train train1=new Train();
		System.out.println("Second time Instantiating from Train ");
		System.out.println(train1.fromLocation);
		System.out.println(train1.toDestination);
		System.out.println(train1.noOfCompartments);
		System.out.println(train1.lengthInMeters);
		System.out.println(train1.noOfCoaches);
		System.out.println("\n");
		
		PenDrive pendrive=new PenDrive();
		System.out.println("Second time Instantiating from PenDrive ");
		System.out.println(pendrive.storageInGb);
		System.out.println(pendrive.brand);
		System.out.println(pendrive.cost);
		System.out.println(pendrive.quantity);
		System.out.println(pendrive.warrantyInYears);
		System.out.println("\n");
		
		PenDrive pendrive1=new PenDrive();
		System.out.println("First time Instantiating from PenDrive ");
		System.out.println(pendrive1.storageInGb);
		System.out.println(pendrive1.brand);
		System.out.println(pendrive1.cost);
		System.out.println(pendrive1.quantity);
		System.out.println(pendrive1.warrantyInYears);
		System.out.println("\n");
		
		Perfume perfume=new Perfume();
		System.out.println("First time Instantiating from Perfume ");
		System.out.println(perfume.cost);
		System.out.println(perfume.fragrance);
		System.out.println(perfume.brand);
		System.out.println(perfume.quantity);
		System.out.println(perfume.perfumeType);
		System.out.println("\n");
		
		Perfume perfume1=new Perfume();
		System.out.println("Second time Instantiating from Perfume ");
		System.out.println(perfume1.cost);
		System.out.println(perfume1.fragrance);
		System.out.println(perfume1.brand);
		System.out.println(perfume1.quantity);
		System.out.println(perfume1.perfumeType);
		System.out.println("\n");
		
		Ambulance ambulance=new Ambulance();
		System.out.println("First time Instantiating from Ambulance ");
		System.out.println(ambulance.ambulanceType);
		System.out.println(ambulance.hospital);
		System.out.println(ambulance.noOFSeats);
		System.out.println(ambulance.emergencyNo);
		System.out.println(ambulance.location);
		System.out.println("\n");
		
		Ambulance ambulance1=new Ambulance();
		System.out.println("Second time Instantiating from Ambulance ");
		System.out.println(ambulance1.ambulanceType);
		System.out.println(ambulance1.hospital);
		System.out.println(ambulance1.noOFSeats);
		System.out.println(ambulance1.emergencyNo);
		System.out.println(ambulance1.location);
		System.out.println("\n");
		
		Kidney kidney=new Kidney();
		System.out.println("First time Instantiating from Kidney ");
		System.out.println(kidney.organName);
		System.out.println(kidney.bloodType);
		System.out.println(kidney.noOfKidenys);
		System.out.println(kidney.anyDisease);
		System.out.println(kidney.noOfHealthyKidneys);
		System.out.println("\n");
		
		
		Kidney kidney1=new Kidney();
		System.out.println("Second time Instantiating from Kidney ");
		System.out.println(kidney1.organName);
		System.out.println(kidney1.bloodType);
		System.out.println(kidney1.noOfKidenys);
		System.out.println(kidney1.anyDisease);
		System.out.println(kidney1.noOfHealthyKidneys);
		System.out.println("\n");
		
		Hospital hospital=new Hospital();
		System.out.println("First time Instantiating from Kidney ");
		System.out.println(hospital.noOfAmbulance);
		System.out.println(hospital.hospitalName);
		System.out.println(hospital.location);
		System.out.println(hospital.noOfPatients);
		System.out.println(hospital.noOfBeds);
		System.out.println("\n");
		
		Hospital hospital1=new Hospital();
		System.out.println("First time Instantiating from Hospital ");
		System.out.println(hospital1.noOfAmbulance);
		System.out.println(hospital1.hospitalName);
		System.out.println(hospital1.location);
		System.out.println(hospital1.noOfPatients);
		System.out.println(hospital1.noOfBeds);
		System.out.println("\n");
		
		Mall mall=new Mall();
		System.out.println("First time Instantiating from Mall ");
		System.out.println(mall.mallName);
		System.out.println(mall.branchName);
		System.out.println(mall.noOfBranches);
		System.out.println(mall.mallLocation);
		System.out.println(mall.noOfFloors);
		System.out.println("\n");
		
		Mall mall1=new Mall();
		System.out.println("Second time Instantiating from Mall ");
		System.out.println(mall1.mallName);
		System.out.println(mall1.branchName);
		System.out.println(mall1.noOfBranches);
		System.out.println(mall1.mallLocation);
		System.out.println(mall1.noOfFloors);
		System.out.println("\n");
		
		Temple temple=new Temple();
		System.out.println("First time Instantiating from Temple ");
		System.out.println(temple.templeName);
		System.out.println(temple.godName);
		System.out.println(temple.templeArea);
		System.out.println(temple.templeHieght);
		System.out.println(temple.templeLocation);
		System.out.println("\n");
		
		Temple temple1=new Temple();
		System.out.println("Second time Instantiating from Temple ");
		System.out.println(temple1.templeName);
		System.out.println(temple1.godName);
		System.out.println(temple1.templeArea);
		System.out.println(temple1.templeHieght);
		System.out.println(temple1.templeLocation);
		System.out.println("\n");
		
		SpaceStation spacestation = new SpaceStation();
		System.out.println("First time Instantiating from SpaceStation ");
		System.out.println(spacestation.spaceStationName);
		System.out.println(spacestation.stationDircetion);
		System.out.println(spacestation.noOfSpaceStation);
		System.out.println(spacestation.distanceFromEarth);
		System.out.println(spacestation.noOfCountiresHavingSpaceStation);
		System.out.println("\n");
		
		SpaceStation spacestation1 = new SpaceStation();
		System.out.println("Second time Instantiating from SpaceStation ");
		System.out.println(spacestation1.spaceStationName);
		System.out.println(spacestation1.stationDircetion);
		System.out.println(spacestation1.noOfSpaceStation);
		System.out.println(spacestation1.distanceFromEarth);
		System.out.println(spacestation1.noOfCountiresHavingSpaceStation);
		System.out.println("\n");
		
		BusStand busstand=new BusStand();
		System.out.println("First time Instantiating from BusStand ");
		System.out.println(busstand.buStandName);
		System.out.println(busstand.noOfBus);
		System.out.println(busstand.noOfBusStands);
		System.out.println(busstand.fromLocation);
		System.out.println(busstand.toDestination);
		System.out.println("\n");
		
		BusStand busstand1=new BusStand();
		System.out.println("Second time Instantiating from BusStand ");
		System.out.println(busstand1.buStandName);
		System.out.println(busstand1.noOfBus);
		System.out.println(busstand1.noOfBusStands);
		System.out.println(busstand1.fromLocation);
		System.out.println(busstand1.toDestination);
		System.out.println("\n");
		
		AllStation allStation=new AllStation();
		System.out.println("First time Instantiating from BusStand ");
		System.out.println(allStation.stationName);
		System.out.println(allStation.stationType);
		System.out.println(allStation.noOfStations);
		System.out.println(allStation.stationArea);
		System.out.println(allStation.distance);
		System.out.println("\n");
		
		AllStation allStation1=new AllStation();
		System.out.println("First time Instantiating from BusStand ");
		System.out.println(allStation1.stationName);
		System.out.println(allStation1.stationType);
		System.out.println(allStation1.noOfStations);
		System.out.println(allStation1.stationArea);
		System.out.println(allStation1.distance);
		System.out.println("\n");
		
		System.out.println("Ending main in InstanceStarter");
		
		
	}
	
}