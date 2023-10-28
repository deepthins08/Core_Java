class Person{
	
	static String bookTicket(String movieName,int quantity){
		
		System.out.println("Starting in Person");
		
		boolean book=BookMyShow.purchaseInAdvance(movieName,quantity);
		
		if(movieName!=null){
			System.out.println("movieName is: "+movieName);	
		}
		
		else{
			System.out.println("Provide movie name ");
		}
		
		if(quantity<1){
			System.out.println("Please select seats");
			
		}
		
		else{
			System.out.println("quantity is "+quantity);
			
		}
		
		if(movieName!=null && quantity>1){
			
			System.out.println("Booking success");
		}
		
		else{
			System.out.println("Booking Failed");
		}
		System.out.println("Ending in Person");
		return "Thank you";
	}
}