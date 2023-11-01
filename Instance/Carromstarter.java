class Carromstarter{
	
	public static void main(String[] game){
		
		System.out.println("Starting main in Carromstarter");
		
		Carrom carrom=new Carrom();
		System.out.println("Carrom noOfCoins are: "+carrom.noOfCoins);
		System.out.println("Carrom brand are: "+carrom.brand);
		System.out.println("Carrom material are: "+carrom.material);
		System.out.println("Carrom height are: "+carrom.height);
		System.out.println("Carrom weight are: "+carrom.weight);
		
		
		Carrom carrom1=new Carrom(24);
		System.out.println("Carrom1 noOfCoins are: "+carrom1.noOfCoins);
		System.out.println("Carrom1 brand are: "+carrom1.brand);
		System.out.println("Carrom1 material are: "+carrom1.material);
		System.out.println("Carrom1 height are: "+carrom1.height);
		System.out.println("Carrom1 weight are: "+carrom1.weight);
		
		Carrom carrom2=new Carrom(24,"GamersHub");
		System.out.println("Carrom2 noOfCoins are: "+carrom2.noOfCoins);
		System.out.println("Carrom2 brand are: "+carrom2.brand);
		System.out.println("Carrom2 material are: "+carrom2.material);
		System.out.println("Carrom2 height are: "+carrom2.height);
		System.out.println("Carrom2 weight are: "+carrom2.weight);
		
		Carrom carrom3=new Carrom(24,"GamersHub","Wooden");
		System.out.println("Carrom3 noOfCoins are: "+carrom3.noOfCoins);
		System.out.println("Carrom3 brand are: "+carrom3.brand);
		System.out.println("Carrom3 material are: "+carrom3.material);
		System.out.println("Carrom3 height are: "+carrom3.height);
		System.out.println("Carrom3 weight are: "+carrom3.weight);
		
		Carrom carrom4=new Carrom(24,"GamersHub","Wooden",3.81);
		System.out.println("Carrom4 noOfCoins are: "+carrom4.noOfCoins);
		System.out.println("Carrom4 brand are: "+carrom4.brand);
		System.out.println("Carrom4 material are: "+carrom4.material);
		System.out.println("Carrom4 height are: "+carrom4.height);
		System.out.println("Carrom4 weight are: "+carrom4.weight);
		
		Carrom carrom5=new Carrom(24,"GamersHub","Wooden",3.81,5);
		System.out.println("Carrom5 noOfCoins are: "+carrom5.noOfCoins);
		System.out.println("Carrom5 brand are: "+carrom5.brand);
		System.out.println("Carrom5 material are: "+carrom5.material);
		System.out.println("Carrom5 height are: "+carrom5.height);
		System.out.println("Carrom5 weight are: "+carrom5.weight);
		
		System.out.println("Starting main in Carromstarter");
	}
}