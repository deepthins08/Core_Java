class HelmetStarter{
	
	public static void main(String[] wore){
		System.out.println("Starting main in HelmetStarter");
		
		Helmet helmet=new Helmet();
		System.out.println("Helmet type is :"+helmet.type);
		System.out.println("Helmet quantity is :"+helmet.quantity);
		System.out.println("Helmet weight is :"+helmet.weight);
		System.out.println("Helmet warranty is :"+helmet.warranty);
		System.out.println("Helmet sportType is :"+helmet.sportType);
		
		Helmet helmet1=new Helmet("Full Face");
		System.out.println("Helmet1 type is :"+helmet1.type);
		System.out.println("Helmet1 quantity is :"+helmet1.quantity);
		System.out.println("Helmet1 weight is :"+helmet1.weight);
		System.out.println("Helmet1 warranty is :"+helmet1.warranty);
		System.out.println("Helmet1 sportType is :"+helmet1.sportType);
		
		Helmet helmet2=new Helmet("Full Face",1);
		System.out.println("Helmet2 type is :"+helmet2.type);
		System.out.println("Helmet2 quantity is :"+helmet2.quantity);
		System.out.println("Helmet2 weight is :"+helmet2.weight);
		System.out.println("Helmet2 warranty is :"+helmet2.warranty);
		System.out.println("Helmet2 sportType is :"+helmet2.sportType);
		
		Helmet helmet3=new Helmet("Full Face",1,800);
		System.out.println("Helmet3 type is :"+helmet3.type);
		System.out.println("Helmet3 quantity is :"+helmet3.quantity);
		System.out.println("Helmet3 weight is :"+helmet3.weight);
		System.out.println("Helmet3 warranty is :"+helmet3.warranty);
		System.out.println("Helmet3 sportType is :"+helmet3.sportType);
		
		Helmet helmet4=new Helmet("Full Face",1,800,2);
		System.out.println("Helmet4 type is :"+helmet4.type);
		System.out.println("Helmet4 quantity is :"+helmet4.quantity);
		System.out.println("Helmet4 weight is :"+helmet4.weight);
		System.out.println("Helmet4 warranty is :"+helmet4.warranty);
		System.out.println("Helmet4 sportType is :"+helmet4.sportType);
		
		Helmet helmet5=new Helmet("Full Face",1,800,2,"Motor BIke");
		System.out.println("Helmet5 type is :"+helmet5.type);
		System.out.println("Helmet5 quantity is :"+helmet5.quantity);
		System.out.println("Helmet5 weight is :"+helmet5.weight);
		System.out.println("Helmet5 warranty is :"+helmet5.warranty);
		System.out.println("Helmet5 sportType is :"+helmet5.sportType);
		
		System.out.println("Ending main in HelmetStarter");
		
	}
	
}