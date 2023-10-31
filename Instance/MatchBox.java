class MatchBox{
	
	String brand;
	int noOfSticks;
	double length;
	double price;
	String size;
	double weight;
	String type;
	
	MatchBox(String brand){
		
		this.brand=brand;
		System.out.println("MatchBox brand is: "+brand);
	}
	
	MatchBox(String brand,int noOfSticks){
		
		this.brand=brand;
		this.noOfSticks=noOfSticks;
		System.out.println("MatchBox brand is: "+brand+" noOfSticks are "+noOfSticks);
	}
	
	MatchBox(String brand,int noOfSticks,double length){
		
		this.brand=brand;
		this.noOfSticks=noOfSticks;
		this.length=length;
		System.out.println("MatchBox brand is: "+brand+"\n noOfSticks are "+noOfSticks+" \nlength is "+length);
	}
	
	MatchBox(String brand,int noOfSticks,double length,double price){
		
		this.brand=brand;
		this.noOfSticks=noOfSticks;
		this.length=length;
		this.price=price;
		System.out.println("MatchBox brand is: "+brand+" \nnoOfSticks are "+noOfSticks+" \nlength is "+length+" \nprice is :"+price);
	}
	
	MatchBox(String brand,int noOfSticks,double length,double price,String size){
		
		this.brand=brand;
		this.noOfSticks=noOfSticks;
		this.length=length;
		this.price=price;
		this.size=size;
		System.out.println("MatchBox brand is: "+brand+" \nnoOfSticks are "+noOfSticks+" \nlength is "+length+" \nprice is :"+price+" \nsize is: "+size);
	}
	
	MatchBox(String brand,int noOfSticks,double length,double price,String size,double weight){
		
		this.brand=brand;
		this.noOfSticks=noOfSticks;
		this.length=length;
		this.price=price;
		this.size=size;
		this.weight=weight;
		System.out.println("MatchBox brand is: "+brand+" \nnoOfSticks are "+noOfSticks+" \nlength is "+length+" \nprice is :"+price+" \nsize is: "+size+" \nweight is "+weight);
	}
	
	MatchBox(String brand,int noOfSticks,double length,double price,String size,double weight,String type){
		
		this.brand=brand;
		this.noOfSticks=noOfSticks;
		this.length=length;
		this.price=price;
		this.size=size;
		this.weight=weight;
		this.type=type;
		System.out.println("MatchBox brand is: "+brand+" \nnoOfSticks are "+noOfSticks+" \nlength is "+length+" \nprice is :"+price+" \nsize is: "+size+" \nweight is "+weight+" \ntype is "+type);
	}
}