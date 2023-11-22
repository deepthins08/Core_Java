class Biryani extends Food{
	
	String name;
	double cost;
	
	Biryani(FoodType type){
		super(type);
		System.out.println("food type is  "+this.type);
	}
	
	void eating(){
		
		System.out.println("Displaying eat in Biryani");
	}
	
	void flavouring(){
		
		System.out.println("Displaying flavour in Biryani");
	}
	
	void preparing(){
		
		System.out.println("Displaying preparing in Biryani");
	}
	
	void sharing(){
		System.out.println("Displaying sharing in Biryani");
		
	}
	
	@Override
	void setFood(){
		System.out.println("Displaying setFood in Biryani");
	}
	
	@Override
	void getFood(){
		System.out.println("Displaying getFood in Biryani");
	}
	
	@Override
	void drink(){
		System.out.println("Displaying drink in Biryani");
	}
	@Override
	void taste(){
		System.out.println("Displaying taste in Biryani");
	}
	
	void show(String name,double cost){
		this.name=name;
		this.cost=cost;
		System.out.println("Biryani name is "+this.name);
		System.out.println("Biryani cost is "+this.cost);
		
	}
	
}