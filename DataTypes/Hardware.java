class Hardware{
	
	String name;
	String type;
	Brand brand;
	
	Hardware(){
		
		System.out.println("created Hardware using no arg const....");
	}
	
	void setBrand(Brand brand){
		
		this.brand=brand;
	}
	
	void setName(String name){
		this.name=name;
	}
	
	void setType(String type){
		this.type=type;
	}
	
	void show(){
		
		System.out.println("Starting show in Hardware");
		System.out.println("Hardware name is "+this.name);
		System.out.println("Hardware name is "+this.type);
		System.out.println("Hardware name is "+this.brand);
		if(brand!=null){
			brand.show();
		}
		
		System.out.println("Ending show in Hardware");
	}
}