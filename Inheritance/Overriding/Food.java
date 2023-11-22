class Food{
	
	String name;
	String color;
	double cost;
	double weight;
	int quantity;
	String flavour;
	FoodType type;
	int noOfOrders;
	int noOfBills;
	String chefName;
	
	
	Food(FoodType type){
		
		this.type=type;
		System.out.println("food type is "+this.type);
	}
	
	void display(){
		
		System.out.println("Food name is "+this.name);
		System.out.println("Food color is "+this.color);
		System.out.println("Food cost is "+this.cost);
		System.out.println("Food weight is "+this.weight);
		System.out.println("Food quantity is "+this.quantity);
		System.out.println("Food flavour is "+this.flavour);
		System.out.println("Food noOfOrders is "+this.noOfOrders);
		System.out.println("Food noOfBills is "+this.noOfBills);
		System.out.println("Food chefName is "+this.chefName);
	}
	
	void cooking(){
		System.out.println("Displaying cooking in Food");
	}
	void setFood(){
		System.out.println("Displaying setFood in Food");
	}
	void getFood(){
		System.out.println("Displaying getFood in Food");
	}
	void eat(){
		System.out.println("Displaying eat in Food");
	}
	void drink(){
		System.out.println("Displaying drink in Food");
	}
	void sell(){
		System.out.println("Displaying sell in Food");
	}
	void parcel(){
		System.out.println("Displaying parcel in Food");
	}
	void promote(){
		System.out.println("Displaying promote in Food");
	}
	void taste(){
		System.out.println("Displaying taste in Food");
	}
	void serve(){
		System.out.println("Displaying serve in Food");
	}
	
	void delivery(){
		System.out.println("Displaying delivery in Food");
	}
	
}