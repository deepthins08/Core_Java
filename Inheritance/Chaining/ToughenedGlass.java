class ToughenedGlass extends Glass{
	
	double weight;
	String ownerName;
	
	ToughenedGlass(double length,boolean thickness){
		super(length,thickness);
		System.out.println("double,thickness arg const in ToughenedGlass");
	}
	
	void setValues(double weight,String ownerName){
		
		this.weight=weight;
		this.ownerName=ownerName;
		System.out.println("ToughenedGlass weight is "+this.weight);
		System.out.println("ToughenedGlass ownerName is "+this.ownerName);
	}
}