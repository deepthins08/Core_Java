class Rocket{
	
	String country;
	String name;
	double weight;
	double height;
	
	
	Rocket(){
		
		super();
	}
	
	Rocket(String country){
		
		super();
		this.country=country;
		System.out.println("rocket launched country is: "+country);
	}
	
	Rocket(String country,String name){
		
		super();
		this.country=country;
		this.name=name;
		System.out.println("rocket launched country and name is: "+country+","+name);
	}
	
	Rocket(String country,String name,double weight){
		
		super();
		this.country=country;
		this.name=name;
		this.weight=weight;
		System.out.println("rocket launched country and name,weight is: "+country+","+name+","+weight);
	}
	
	Rocket(String country,String name,double weight,double height){
		
		super();
		this.country=country;
		this.name=name;
		this.weight=weight;
		this.height=height;
		System.out.println("rocket launched country and name,weight ,height is: "+country+","+name+","+weight+","+height);
	}
}