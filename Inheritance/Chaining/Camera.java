class Camera{
	
	String brand;
	ColorType color;
	double pixel;
	int batteryDuration;
	
	Camera(String brand,double pixel,int batteryDuration){
		this.brand=brand;
		this.pixel=pixel;
		this.batteryDuration=batteryDuration;
	    System.out.println("String,double,int arg const in Camera");	
		System.out.println("Camera brand is "+this.brand);
		System.out.println("Camera pixel is "+this.pixel);
		System.out.println("Camera batteryDuration is "+this.batteryDuration);
	}
	
	void setColor(ColorType color){
		
		this.color=color;
		System.out.println("Color is "+this.color);
	}
	
	
}