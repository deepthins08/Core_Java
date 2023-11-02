class Month{
	
	String name;
	int noOfDays;
	int noOfWeeks;
	int noOfHolidays;
	
	Month(String name,int noOfDays,int noOfWeeks,int noOfHolidays){
		this.name=name;
		this.noOfDays=noOfDays;
		this.noOfWeeks=noOfWeeks;
		this.noOfHolidays=noOfHolidays;
		System.out.println("Creating Month with String,int,int,int argument constructor");
	}
	
	
	void displayInfo(){
		
		System.out.println("Starting displayInfo");
		
		System.out.println("Month Name is "+this.name);
		System.out.println("noOfDays in a month "+this.noOfDays);
		System.out.println("noOfWeeks in a Month "+this.noOfWeeks);
		System.out.println("noOfHolidays in a month "+this.noOfHolidays);
		
		System.out.println("Starting displayInfo");
	}
}