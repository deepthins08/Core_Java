class Restaurant{
	
	
	String ownerName="David";
	String[] specialItems;
	
	Restaurant(String[] specialItems){
		this.specialItems=specialItems;
		System.out.println("craeted Restaurant with String[] argument constructor");
	}
	
	void displayInfo(){
		
		System.out.println("Starting displayInfo in Restaurant");
		System.out.println("ownerName is "+this.ownerName);
		System.out.println("specialItems are "+this.specialItems);
		if(this.specialItems!=null){
		for(int seq=0;seq<this.specialItems.length;seq++){
			
			String ref=this.specialItems[seq];
			System.out.println("speacial items are "+this.specialItems[seq]+" at the seq "+seq);
			//System.out.println(this.specialItems[seq]);
		}
		}
		
		System.out.println("Ending displayInfo in Restaurant");
	}
}