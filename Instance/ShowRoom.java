class ShowRoom{
	
	String showRoomName;
	String location;
	int noOfVehicles;
	double areaInSqFt;
	int noOfFloors;
	long mobile;
	String ownerName;
	int rating;
	
	ShowRoom(String showRoomName){
		this.showRoomName=showRoomName;
		System.out.println("ShowRoom name is :"+showRoomName);
	}
	
	ShowRoom(String showRoomName,String location){
		this.showRoomName=showRoomName;
		this.location=location;
		System.out.println("ShowRoom name is :"+showRoomName+" \nlocation is :"+location);
	}
	
	ShowRoom(String showRoomName,String location,int noOfVehicles){
		this.showRoomName=showRoomName;
		this.location=location;
		this.noOfVehicles=noOfVehicles;
		System.out.println("ShowRoom name is :"+showRoomName+" \nlocation is :"+location+" \nnoOfVehicles are :"+noOfVehicles);
	}
	
	ShowRoom(String showRoomName,String location,int noOfVehicles,double areaInSqFt){
		this.showRoomName=showRoomName;
		this.location=location;
		this.noOfVehicles=noOfVehicles;
		this.areaInSqFt=areaInSqFt;
		System.out.println("ShowRoom name is :"+showRoomName+" \nlocation is :"+location+" \nnoOfVehicles are :"+noOfVehicles+" \n areaInSqFt "+areaInSqFt);
	}
	
	ShowRoom(String showRoomName,String location,int noOfVehicles,double areaInSqFt,int noOfFloors){
		this.showRoomName=showRoomName;
		this.location=location;
		this.noOfVehicles=noOfVehicles;
		this.areaInSqFt=areaInSqFt;
		this.noOfFloors=noOfFloors;
		System.out.println("ShowRoom name is :"+showRoomName+" \nlocation is :"+location+" \nnoOfVehicles are :"+noOfVehicles+" \n areaInSqFt "+areaInSqFt+" \nnoOfFloors "+noOfFloors);
	}
	
	ShowRoom(String showRoomName,String location,int noOfVehicles,double areaInSqFt,int noOfFloors,long mobile){
		this.showRoomName=showRoomName;
		this.location=location;
		this.noOfVehicles=noOfVehicles;
		this.areaInSqFt=areaInSqFt;
		this.noOfFloors=noOfFloors;
		this.mobile=mobile;
		System.out.println("ShowRoom name is :"+showRoomName+" \nlocation is :"+location+" \nnoOfVehicles are :"+noOfVehicles+" \n areaInSqFt "+areaInSqFt+" \nnoOfFloors "+noOfFloors+" \nmobile no is: "+mobile);
	}
	
	ShowRoom(String showRoomName,String location,int noOfVehicles,double areaInSqFt,int noOfFloors,long mobile,String ownerName){
		this.showRoomName=showRoomName;
		this.location=location;
		this.noOfVehicles=noOfVehicles;
		this.areaInSqFt=areaInSqFt;
		this.noOfFloors=noOfFloors;
		this.mobile=mobile;
		this.ownerName=ownerName;
		System.out.println("ShowRoom name is :"+showRoomName+" \nlocation is :"+location+" \nnoOfVehicles are :"+noOfVehicles+" \n areaInSqFt "+areaInSqFt+" \nnoOfFloors "+noOfFloors+" \nmobile no is: "+mobile+" \nownerName is :"+ownerName);
	}
	
	ShowRoom(String showRoomName,String location,int noOfVehicles,double areaInSqFt,int noOfFloors,long mobile,String ownerName,int rating){
		this.showRoomName=showRoomName;
		this.location=location;
		this.noOfVehicles=noOfVehicles;
		this.areaInSqFt=areaInSqFt;
		this.noOfFloors=noOfFloors;
		this.mobile=mobile;
		this.ownerName=ownerName;
		this.rating=rating;
		System.out.println("ShowRoom name is :"+showRoomName+" \nlocation is :"+location+" \nnoOfVehicles are :"+noOfVehicles+" \n areaInSqFt "+areaInSqFt+" \nnoOfFloors "+noOfFloors+" \nmobile no is: "+mobile+" \nownerName is :"+ownerName+" \nrating is "+rating);
	}
}