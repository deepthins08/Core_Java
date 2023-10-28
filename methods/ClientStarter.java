class ClientStarter{
	
	public static void main(String[] buying){
		
		System.out.println("Starting main in ClientStarter ");
		
		/***int discount=Vendor.billProduct("TV",11);
		System.out.println(discount);
		discount=Vendor.billProduct("Fridge",25);
		System.out.println(discount);
		discount=Vendor.billProduct("Owen",35);
		System.out.println(discount);
		discount=Vendor.billProduct("Mobile",31);
		System.out.println(discount);
		discount=Vendor.billProduct("TV",5);
		System.out.println(discount);***/
		
		String online=Client.purchaseProduct("Divya","TV",11);
		System.out.println(online);
		online=Client.purchaseProduct("Shreyas","Fridge",25);
		System.out.println(online);
		online=Client.purchaseProduct("Shambu","Owen",35);
		System.out.println(online);
		online=Client.purchaseProduct("Geetha","Mobile",31);
		System.out.println(online);
		online=Client.purchaseProduct("Nitin","Toaster",5);
		System.out.println(online);
		online=Client.purchaseProduct("Geetha","TV",5);
		System.out.println(online);
		
		
		System.out.println("Ending main in ClientStarter ");
	}
}