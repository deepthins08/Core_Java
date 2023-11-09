class Brand{
	
	String name="Dell";
	String origin="US";
	String ceoName="Michael Dell";
	City[] cities;
	
	Brand(){
		
		System.out.println("created Brand using no arg const....");
	}
	
	void setCities(City[] cities){
		
		this.cities=cities;
	}
	
	void show(){
		
		System.out.println("Starting show in Brand");
		System.out.println("Brand name "+this.name);
		System.out.println("Brand origin "+this.origin);
		System.out.println("Brand ceoName "+this.ceoName);
		System.out.println("Brand cities "+this.cities);
		if(cities!=null){
			for(int seq=0;seq<this.cities.length;seq++){
				
				City ref=this.cities[seq];
				System.out.println("Cities are "+this.cities[seq]+" at the seq "+ref);
				ref.show();
			}
		}
		
		System.out.println("Ending show in Brand");
	}
	
}