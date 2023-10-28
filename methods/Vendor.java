class Vendor{
	
	static int billProduct(String product,int quantity){
		
		System.out.println("Starting in billProduct");
		int discount=Manufacturer.getDiscount(product,quantity);
		System.out.println(discount);
		if(product=="TV"){
			int price=0;
			int dis=0;
			if(quantity>10){
				int total=20000*quantity;
				System.out.println("Total price of the TV without discount is: "+total);
				dis=(20000*quantity*discount)/100;
				price=20000*quantity-dis;
				System.out.println("Total price of the TV is: "+price);
				System.out.println("Ending in billProduct");
				return price;
			}
			else{
				price=20000;
				System.out.println("Total price of the TV without discount is: "+price*quantity);
				System.out.println("Ending in billProduct");
				return price*quantity;
			}
		}
		
		if(product=="Toaster"){
			int price=1000;
			System.out.println("Total price of the Toaster is: "+price*quantity);
			System.out.println("Ending in billProduct");
			return price*quantity;
			
		}
		
		if(product=="Fridge"){
			int price=0;
			int dis=0;
			if(quantity>20){
				int total=25000*quantity;
				System.out.println("Total price of the Fridge without discount is: "+total);
				dis=(25000*quantity*discount)/100;
				price=25000*quantity-dis;
				System.out.println("Total price of the Fridge with discount is: "+price);
				System.out.println("Ending in billProduct");
				return price;
			}
			else{
				price=25000;
				System.out.println("Total price of the Fridge is: "+price*quantity);
				System.out.println("Ending in billProduct");
				return price*quantity;
			}
		}
		
		if(product=="Owen"){
			int price=0;
			int dis=0;
			
			if(quantity>30){
				int total=50000*quantity;
				System.out.println("Total price of the Owen without discount is: "+total);
				dis=(50000*quantity*discount)/100;
				price=50000*quantity-dis;
				System.out.println("Total price of the Owen with discount is: "+price);
				System.out.println("Ending in billProduct");
				return price;
			}
			else{
				price=50000;
				System.out.println("Total price of the Owen is: "+price*quantity);
				System.out.println("Ending in billProduct");
				return price*quantity;
			}
		}
		
		if(product=="Mobile"){
			int price=0;
			int dis=0;
			if(quantity>30){
				int total=7500*quantity;
				System.out.println("Total price of the Mobile without discount is: "+total);
				dis=(7500*quantity*discount)/100;
				price=7500*quantity-dis;
				System.out.println("Total price of the Mobile with discount is: "+price);
				System.out.println("Ending in billProduct");
				return price;
			}
			else{
				price=7500;
				System.out.println("Total price of the Mobile is: "+price*quantity);
				System.out.println("Ending in billProduct");
				return price*quantity;
			}
		}
		
		
		
		
		return 0;
	}
	
}