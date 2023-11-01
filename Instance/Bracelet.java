class Bracelet{
	
	String type;
	String metal;
	double cost;
	double weight;
	double length;
	
	
	Bracelet(){
		this("Twisted","Gold",25000,7,25);
		System.out.println("Invoked no-argument constructor");
	}
	
	Bracelet(String type){
		
		this.type=type;
		System.out.println("Invoked String argument constructor "+type);
	}
	
	Bracelet(String type,String metal){
		
		this.type=type;
		this.metal=metal;
		System.out.println("Invoked String,String argument constructor "+type+","+metal);
	}
	
	Bracelet(String type,String metal,double cost){
		
		this.type=type;
		this.metal=metal;
		this.cost=cost;
		System.out.println("Invoked String,String,double argument constructor "+type+","+metal+","+cost);
	}
	
	Bracelet(String type,String metal,double cost,double weight){
		
		this.type=type;
		this.metal=metal;
		this.cost=cost;
		this.weight=weight;
		System.out.println("Invoked String,String,double,double argument constructor "+type+","+metal+","+cost+","+weight);
	}
	
	Bracelet(String type,String metal,double cost,double weight,double length){
		
		this.type=type;
		this.metal=metal;
		this.cost=cost;
		this.weight=weight;
		this.length=length;
		System.out.println("Invoked String,String,double,double,double argument constructor "+type+","+metal+","+cost+","+weight+","+length);
	}
	
}