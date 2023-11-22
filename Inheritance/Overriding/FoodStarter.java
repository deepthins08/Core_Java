class FoodStarter{
	
	public static void main(String... eating){
		
	System.out.println("Starrting main FoodStarter");
	Biryani biryani=new Biryani(FoodType.MEALS);
	biryani.name="Gobi";
	biryani.color="Red";
	biryani.cost=200;
	biryani.weight=20;
	biryani.quantity=1;
	biryani.flavour="chilli";
	biryani.noOfOrders=2;
	biryani.noOfBills=5;
	biryani.chefName="Duke";
	
	biryani.display();
	biryani.cooking();
	biryani.setFood();
	biryani.getFood();
	biryani.eat();
	biryani.drink();
	biryani.sell();
	biryani.parcel();
	biryani.promote();
	biryani.taste();
	biryani.serve();
	biryani.delivery();
	
	biryani.eating();
	biryani.flavouring();
	biryani.preparing();
	biryani.sharing();
	
	
	System.out.println("Ending main FoodStarter");
	}
}