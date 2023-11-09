class Laptop{
	
	Hardware[] hardware;
	Owner owner;
	Brand brand;
	
	
	Laptop(){
		
		System.out.println("created Laptop using no arg const....");
	}
	
	void setHardware(Hardware[] hardware){
		this.hardware=hardware;
	}
	
	void setOwner(Owner owner){
		this.owner=owner;
	}
	
	void setBrand(Brand brand){
		
		this.brand=brand;
	}
	
	void show(){
		
		System.out.println("Starting show in Laptop");
		System.out.println("Hardware is "+this.hardware);
		if(hardware!=null){
			for(int seq=0;seq<this.hardware.length;seq++){
				
				Hardware ref=this.hardware[seq];
				System.out.println("Hardware is "+this.hardware[seq]+" at the seq "+ref);
				ref.show();
			}
		}
		
		System.out.println("owner is "+this.owner);
		if(owner!=null){
			owner.show();
		}
		System.out.println("brand is "+this.brand);
		if(brand!=null){
			brand.show();
		}
		
		System.out.println("Ending show in Laptop");
	}
}