class Glass{
	
	double length;
	boolean thickness;
	GlassType type;
	String usage;
	String brand;
	
	Glass(double length,boolean thickness){
		
		this.length=length;
		this.thickness=thickness;
		System.out.println("double,double arg const in Galss");
		System.out.println("Glass length is "+this.length);
		System.out.println("Glass thickness is "+this.thickness);
	}
	
	void setType(GlassType type){
		
		this.type=type;
		System.out.println("Glass type is "+this.type);
	}
	
	void setValues(String usage,String brand){
		
		this.usage=usage;
		this.brand=brand;
		
		System.out.println("Glass usage is "+this.usage);
		System.out.println("Glass brand is "+this.brand);
	}
}