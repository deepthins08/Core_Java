class Movie{
	
	static void buyTicket(String movieName,int quantity){
		
		System.out.println("Starting of buyTicket");
		System.out.println("Movie Name is: "+movieName);
		System.out.println("quantity is: "+quantity);
		
		if(quantity>0 && quantity<10){
			
			System.out.println("Quantity is valid ");
		}
		else{
			System.out.println("Quantity is invalid ");
		}
		System.out.println("Ending of buyTicket");
	}
	
	static void cancelTicket(String movieName,int quantity,double charges){
		System.out.println("Starting of cancelTicket");
		System.out.println("Movie Name is: "+movieName);
		System.out.println("quantity is: "+quantity);
	    System.out.println("charges is: "+charges);
		if(quantity>0 && quantity<10){
			
			System.out.println("Quantity is valid ");
		}
		else{
			System.out.println("Quantity is invalid ");
		}
		
		if(charges>0 && charges<5){
			
			System.out.println("Charges is valid ");
		}
		else{
			System.out.println("Charges is invalid ");
		}
		System.out.println("Ending of cancelTicket");
		
	}
	
	
	static void bookTicket(String movieName,String lang,int total,boolean anyCoupon){
		
		System.out.println("starting of bookTicket");
		System.out.println("Movie Name is: "+movieName);
		System.out.println("Language is: "+lang);
		System.out.println("total is: "+total);
		System.out.println("coupon is: "+anyCoupon);
		if(total>0 && total<10){
			
			System.out.println("Total is valid ");
		}
		else{
			System.out.println("Total is invalid ");
		}
		
		if(anyCoupon==true){
			
			System.out.println("coupon is valid ");
		}
		else{
			System.out.println("coupon is invalid ");
		}
		
		System.out.println("ending of of bookTicket");
		
	}
}