class Starter{
	
	
	public static void main(String[] args){
		
		System.out.println("Starting of main in Starter");
		System.out.println("\n");
		
		System.out.println("Starting of Snack");
		Snack.setCostInRupee(30);
		System.out.println("Cost of snack: "+Snack.costInRupee);
		
		Snack.setName("Chips");
		System.out.println("name of snack is: "+Snack.name);
		
		Snack.setQuantity(2);
		System.out.println("quantity of snack is: "+Snack.quantity);
		System.out.println("ending of Snack");
		System.out.println("\n");
		
		System.out.println("Starting of Banner");
		Banner.setName("Technical");
		System.out.println("name of Banner is: "+Banner.name);
		
		Banner.setQuantity(20);
		System.out.println("quantity of banner is: "+Banner.quantity);
		
		Banner.setTitle("Technical Event");
		System.out.println("title of banner is: "+Banner.title);
		System.out.println("ending of Banner");
		System.out.println("\n");
		
		System.out.println("Starting of Scanner");
		Scanner.setPlatfromName("GooglePay");
		System.out.println("platformname of scanner is: "+Scanner.platformName);
		
		Scanner.setAmount(400);
		System.out.println("amount to be scanned is: "+Scanner.amount);
		
		Scanner.setScan("QR Code");
		System.out.println("title of banner is: "+Scanner.scan);
		System.out.println("ending of Scanner");
		System.out.println("\n");
		
		System.out.println("Starting of Store");
		Store.setStoreName("Mahadev Store");
		System.out.println("Name of the storeis: "+Store.storeName);
		
		Store.setAddress("BTM,Banglore");
		System.out.println("address of store is: "+Store.address);
		
		Store.setMobile(48848478370L);
		System.out.println("Mobile no is : "+Store.mobile);

		System.out.println("ending of Store");
		System.out.println("\n");
		
		System.out.println("Starting of TrafficLight");
		TrafficLight.setColor("Red");
		System.out.println("color is: "+TrafficLight.color);
		
		TrafficLight.setSignal("Stop");
		System.out.println("signal is: "+TrafficLight.signal);
		
		TrafficLight.setNoOftrafficLight(3D);
		System.out.println("noOfTrafficLight is : "+TrafficLight.noOfTrafficLight);

		System.out.println("ending of TrafficLight");
		System.out.println("\n");
		
		System.out.println("Starting of Tree");
		Tree.setTreeName("Banyan");
		System.out.println("tree name is: "+Tree.treeName);
		
		Tree.setHeightInFeet(30);
		System.out.println("hieght is: "+Tree.heightInFeet);
		
		Tree.setNoOfTrees(10);
		System.out.println("no of trees is : "+Tree.noOfTrees);

		System.out.println("ending of Tree");
		System.out.println("\n");
		
		System.out.println("Starting of Vehicle");
		Vehicle.setVehicleName("splender");
		System.out.println("vehicle name is: "+Vehicle.vehicleName);
		
		Vehicle.setBrand("Hero");
		System.out.println("brand is: "+Vehicle.brand);
		
		Vehicle.setVehicleType("Bike");
		System.out.println("vehicle type is : "+Vehicle.vehicleType);

		System.out.println("ending of Vehicle");
		System.out.println("\n");
		
		System.out.println("Starting of Road");
		Road.setVehicleName("Car");
		System.out.println("vehicle name is: "+Road.vehicleName);
		
		Road.setRoadName("Mico Layout road");
		System.out.println("road name is: "+Road.roadName);
		
		Road.setRoadType("straight");
		System.out.println("road type is : "+Road.roadType);

		System.out.println("ending of Road");
		System.out.println("\n");
		
		System.out.println("Starting of Metro");
		Metro.setStationName("Mejestic metro station");
		System.out.println("metro station name is: "+Metro.stationName);
		
		Metro.setDoorOpeningDirection("left");
		System.out.println("doorOpeningDricetion is: "+Metro.doorOpeningDricetion);
		
		Metro.setPlatform(2);
		System.out.println("platform is : "+Metro.platform);

		System.out.println("ending of Metro");
		System.out.println("\n");
		
		System.out.println("Starting of FootPath");
		FootPath.setNoOfPedestrians(30);
		System.out.println("noOfPedestrians: "+FootPath.noOfPedestrians);
		
		FootPath.setFootPathName("Ring road footpath");
		System.out.println("footPathName is: "+FootPath.footPathName);
		
		FootPath.setNoOfLightPole(15);
		System.out.println("noOfLightPole : "+FootPath.noOfLightPole);

		System.out.println("ending of FootPath");
		System.out.println("\n");

		System.out.println("ending of main in Starter");
		
	}
}