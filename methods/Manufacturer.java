class Manufacturer{
	
	static int getDiscount(String product,int quantity){
		System.out.println("Starting in Manufacturer");
		if(quantity>=1 && quantity<=50){
			if(product=="TV"){
				System.out.println("Product is TV");
			   if(quantity>10){
			      System.out.println("Discount is 5%");
				  return 5;
		       }
			}
		    else if(product=="Fridge"){
			   System.out.println("Product is Fridge ");
			   if(quantity>20){
				   System.out.println(" Discount is 10%");
				   return 10;
			   }
		    }
		    else if(product=="Toaster"){
			   System.out.println("Product is Toaster");
		    }
		    else if(product=="Owen"){
			   System.out.println("Product is Owen");
			   if(quantity>30){
				  System.out.println("discount is 15%"); 
				  return 15;
			   }
		    }
		    else if(product=="Mobile"){
			   System.out.println("Product is Mobile");
			   if(quantity>30){
				  System.out.println("discount is 15%");
				  return 15;
			   }
		    }
			else{
				System.out.println("Please choose the available product");
			}
			System.out.println("Qunatity of "+product+  " is :");
			
			return quantity;
		}
		
		return 0;
		
	}

}