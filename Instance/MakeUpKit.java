class MakeUpKit{
	
	String brand;
	int noOfItems;
	double weight;
	String madeIn;
	
	MakeUpKit(){
		
		super();
	}
	
	MakeUpKit(String brand){
		super();
		this.brand=brand;
		System.out.println("MakeUpKit brand is: "+brand);
		
	}
	
	MakeUpKit(String brand,int noOfItems){
		super();
		this.brand=brand;
		this.noOfItems=noOfItems;
		System.out.println("MakeUpKit brand,noOfItems is: "+brand+","+noOfItems);
		
	}
	
	MakeUpKit(String brand,int noOfItems,double weight){
		super();
		this.brand=brand;
		this.noOfItems=noOfItems;
		this.weight=weight;
		System.out.println("MakeUpKit brand,noOfItems,weight is: "+brand+","+noOfItems+","+weight);
		
	}
	
	MakeUpKit(String brand,int noOfItems,double weight,String madeIn){
		super();
		this.brand=brand;
		this.noOfItems=noOfItems;
		this.weight=weight;
		this.madeIn=madeIn;
		System.out.println("MakeUpKit brand,noOfItems,weight is: "+brand+","+noOfItems+","+weight+","+madeIn);
		
	}
}