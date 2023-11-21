class LaminatedGlass extends Glass{
	
	double cost;
	int warranty;
	
	LaminatedGlass(double length,boolean thickness){
		super(length,thickness);
		System.out.println("double,boolean arg const in LaminatedGlass");
		
	}
	
	void setValues(double cost,int warranty){
		
		this.cost=cost;
		this.warranty=warranty;
		System.out.println("LaminatedGlass cost is "+this.cost);
		System.out.println("LaminatedGlass warranty is "+this.warranty);
		
	}
}