class Client{
	
	/***static boolean purchaseProduct(String clientName,String product,int quantity){
		
		System.out.println("Starting in Client");
		
		boolean purchase=Amazon.onlinePurchase(clientName,product,quantity);
		
		if(purchase){
			
			System.out.println("Product is Purchased Successfully");
			System.out.println("Ending in Client");
			return true;
		}
		else{
			
			System.out.println("Product is not Purchased");
			System.out.println("Ending in Client");
			return false;
		}
		

	}***/
	
	static String purchaseProduct(String clientName,String product,int quantity){
		
		System.out.println("Starting in Client");
		
		boolean purchase=Amazon.onlinePurchase(clientName,product,quantity);
		
		if(purchase){
			
			System.out.println("Product is Purchased Successfully");
			
		}
		else{
			
			System.out.println("Product is not Purchased");
			
		}
		
			return "Ending in Client";

	}
}