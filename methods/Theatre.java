class Theatre{
	
	static int provideTotal(String movieName,int quantity,int price){
		
		System.out.println("Starting in Theatre");
		
		if(movieName=="Leo"){
			System.out.println("Movie name is: "+movieName+" quantity is "+quantity);
			int total=quantity*price;
			return total;
			
		}
		
		else if(movieName=="Ghost" ){
			System.out.println("Movie name is: "+movieName+ " quantity is "+quantity);
			int total=quantity*price;
			return total;
		}
		
		else if(movieName=="Kanthara" ){
			System.out.println("Movie name is: "+movieName+ " quantity is "+quantity);
			int total=quantity*price;
			return total;
		}
		
		else if(movieName=="SSE"){
			System.out.println("Movie name is: "+movieName+ " quantity is "+quantity);
			int total=quantity*price;
			return total;
		}
		System.out.println("Ending in Theatre");
		return 0;
	}
}