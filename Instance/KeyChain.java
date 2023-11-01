class KeyChain{
	
	String color;
	double length;
	int quantity;
	String type;
	int rating;
	
	KeyChain(){
		this("pink",6,3,"doll",4);
		System.out.println("invoked no-argument constructor");
	}
	
	
	KeyChain(String color){
		
		this.color=color;
		System.out.println("Invoked String argument "+color);
	}
	
	KeyChain(String color,double length){
		
		this.color=color;
		this.length=length;
		System.out.println("Invoked String,double argument "+color+","+length);
	}
	
	KeyChain(String color,double length,int quantity){
		
		this.color=color;
		this.length=length;
		this.quantity=quantity;
		System.out.println("Invoked String,double,int argument "+color+","+length+","+quantity);
	}
	
	KeyChain(String color,double length,int quantity,String type){
		
		this.color=color;
		this.length=length;
		this.quantity=quantity;
		this.type=type;
		System.out.println("Invoked String,double,int,String argument "+color+","+length+","+quantity+","+type);
	}
	
	KeyChain(String color,double length,int quantity,String type,int rating){
		
		this.color=color;
		this.length=length;
		this.quantity=quantity;
		this.type=type;
		this.rating=rating;
		System.out.println("Invoked String,double,int,String,int argument "+color+","+length+","+quantity+","+type+","+rating);
	}
}