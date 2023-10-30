class KeyBoard{

String brand;
String color;
int noOfKeys;
String type;
double cost;

KeyBoard(){
	
	System.out.println("no-arguments constructer");
}

KeyBoard(String brand){
	
	this.brand=brand;
	System.out.println("KeyBoard brand is: "+brand);
}

KeyBoard(String brand,String color){
	
	this.brand=brand;
	this.color=color;
	System.out.println("KeyBoard brand "+brand+" and cost is: "+cost);
}

KeyBoard(String brand,String color,int noOfKeys){
	
	this.brand=brand;
	this.color=color;
	this.noOfKeys=noOfKeys;
	System.out.println("KeyBoard brand "+brand+" and cost is: "+cost+" no of keys are "+noOfKeys);
}

KeyBoard(String brand,String color,int noOfKeys,String type){
	
	this.brand=brand;
	this.color=color;
	this.noOfKeys=noOfKeys;
	this.type=type;
	System.out.println("KeyBoard brand "+brand+" and cost is: "+cost+" no of keys are "+noOfKeys+" type is "+type);
}

KeyBoard(String brand,String color,int noOfKeys,String type,double cost){
	
	this.brand=brand;
	this.color=color;
	this.noOfKeys=noOfKeys;
	this.type=type;
	this.cost=cost;
	System.out.println("KeyBoard brand "+brand+" and cost is: "+cost+" no of keys are"+noOfKeys+" type is"+type+" cost is "+cost);
}

}