class BookMyShow{
	
	static boolean purchaseInAdvance(String movieName,int qunatity){
		
		System.out.println("Starting in BookMyShow");
		
		int ref=Theatre.provideTotal(movieName,qunatity,250);
		System.out.println("total is :"+ref);
		
		
		if(movieName!=null){
			
			System.out.println("Theatre is confirmed");
			System.out.println("Ending in Theatre");
			return true;
		}
		
		else{
			System.out.println("Theatre is not confirmed");
			System.out.println("Ending in Theatre");
		    return false;
		}
		
	}
	
}