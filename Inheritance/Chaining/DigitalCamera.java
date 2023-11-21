class DigitalCamera extends Camera{
	
	DigitalCamera(String brand,double pixel,int batteryDuration){
		
		super(brand,pixel,batteryDuration);
		System.out.println("String,double,int arg const in DigitalCamera");
	}
	
}