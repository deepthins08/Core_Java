class Helmet{
	
	String type;
	int quantity;
    double weight;
	int warranty;
	String sportType;
	
	
	Helmet(){
		this("Open Face",1,900,1,"Motor Bike");
		System.out.println("Invoked no argument constructor");
	}
	
	Helmet(String type){
		
		this.type=type;
		System.out.println("Invoked String argument "+type);
	}
	
	Helmet(String type,int quantity){
		
		this.type=type;
		this.quantity=quantity;
		System.out.println("Invoked String,String argument "+type+","+quantity);
	}
	
	Helmet(String type,int quantity,double weight){
		
		this.type=type;
		this.quantity=quantity;
		this.weight=weight;
		System.out.println("Invoked String,String,int argument "+type+","+quantity+","+weight);
	}
	
	Helmet(String type,int quantity,double weight,int warranty){
		
		this.type=type;
		this.quantity=quantity;
		this.weight=weight;
		this.warranty=warranty;
		System.out.println("Invoked String,String,double,int argument "+type+","+quantity+","+weight+","+warranty);
	}
	
	Helmet(String type,int quantity,double weight,int warranty,String sportType){
		
		this.type=type;
		this.quantity=quantity;
		this.weight=weight;
		this.warranty=warranty;
		this.sportType=sportType;
		System.out.println("Invoked String,String,double,int,String argument "+type+","+quantity+","+weight+","+warranty+","+sportType);
	}
	
	
}