class Clock{
	
	String type;
	int noOfBatteries;
	String brand;
	boolean wallClock;
	
	
	Clock(){
		
		super();
	}
	
	Clock(String type){
		super();
		this.type=type;
		System.out.println("Clock type :"+type);
		
	}
	
	Clock(String type, int noOfBatteries){
		super();
		this.type=type;
		this.noOfBatteries=noOfBatteries;
		System.out.println("Clock type and noOfBatteries are :"+type+","+noOfBatteries);
		
	}
	
	Clock(String type, int noOfBatteries,String brand){
		super();
		this.type=type;
		this.noOfBatteries=noOfBatteries;
		this.brand=brand;
		System.out.println("Clock type and noOfBatteries,brand are :"+type+","+noOfBatteries+","+brand);
		
	}
	
	Clock(String type, int noOfBatteries,String brand,boolean wallClock){
		super();
		this.type=type;
		this.noOfBatteries=noOfBatteries;
		this.brand=brand;
		this.wallClock=wallClock;
		System.out.println("Clock type and noOfBatteries,brand ,wallClock are :"+type+","+noOfBatteries+","+brand+","+wallClock);
		
	}
}