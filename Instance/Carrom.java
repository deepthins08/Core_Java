class Carrom{
	
	int noOfCoins;
	String brand;
	String material;
	double height;
	double weight;
	
	Carrom(){
		this(24,"RPS","Wooden",50,1.5);
		System.out.println("Invoked no-arguments Constructor");
	}
	
	Carrom(int noOfCoins){
		this.noOfCoins=noOfCoins;
		System.out.println("Invoked int arguments Constructor :"+noOfCoins);
	}
	
	Carrom(int noOfCoins,String brand){
		this.noOfCoins=noOfCoins;
		this.brand=brand;
		System.out.println("Invoked int,String arguments Constructor :"+noOfCoins+","+brand);
	}
	
	Carrom(int noOfCoins,String brand,String material){
		this.noOfCoins=noOfCoins;
		this.brand=brand;
		this.material=material;
		System.out.println("Invoked int,String,String arguments Constructor :"+noOfCoins+","+brand+","+material);
	}
	
	Carrom(int noOfCoins,String brand,String material,double height){
		this.noOfCoins=noOfCoins;
		this.brand=brand;
		this.material=material;
		this.height=height;
		System.out.println("Invoked int,String,String,double arguments Constructor :"+noOfCoins+","+brand+","+material+","+height);
	}
	
	Carrom(int noOfCoins,String brand,String material,double height,double weight){
		this.noOfCoins=noOfCoins;
		this.brand=brand;
		this.material=material;
		this.height=height;
		this.weight=weight;
		System.out.println("Invoked int,String,String,double,double arguments Constructor :"+noOfCoins+","+brand+","+material+","+height+","+weight);
	}
	
}