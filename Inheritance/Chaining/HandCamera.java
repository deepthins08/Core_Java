class HandCamera extends Camera{
	
	double weight;
	HandCamera(String brand,double pixel,int batteryDuration){
		
		super(brand,pixel,batteryDuration);
		System.out.println("String,double,int arg const in HandCamera");
	}
	
	void setWeight(double weight){
		
		this.weight=weight;
		System.out.println("weight is "+this.weight);
	}
}