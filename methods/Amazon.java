class Amazon{
	
	static boolean onlinePurchase(String clientName,String Product,int quantity){
		
		System.out.println("Starting in Amazon");
		int bill=Vendor.billProduct(Product,quantity);
		if(clientName=="Divya" || clientName=="Shreyas" || clientName=="Shambu" || clientName=="Geetha" || clientName=="Nitin"){
			
			if(bill>0){
				System.out.println(clientName+" your Product billed "+bill);
				System.out.println("Ending in Amazon");
				return true;
			}
			else {
				System.out.println("Product is not billed");
				System.out.println("Ending in Amazon");
				return false;
			}
		}
		
		return false;
	}
}