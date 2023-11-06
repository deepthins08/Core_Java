class Hotel{
	
	String name;
	String ownerName;
	MenuCard menucard;
	
	void setValues1(String name,String ownerName,MenuCard menucard){
		
		this.name=name;
		this.ownerName=ownerName;
		this.menucard=menucard;
		
		}
	void showInfo(){
		
		System.out.println("Hotel name is "+this.name);
		System.out.println("Hotel ownerName is "+this.ownerName);
		System.out.println("Hotel menucard is "+this.menucard);
		if(menucard!=null){
		System.out.println("Hotel totalItems are "+this.menucard.totalItems);
		System.out.println("Hotel items cost are "+this.menucard.cost);
	}
	}
}