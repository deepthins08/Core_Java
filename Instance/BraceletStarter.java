class BraceletStarter{
	
	
	public static void main(String[] wear){
		
		System.out.println("Starting main in BraceletStarter");
		
		Bracelet bracelet=new Bracelet();
		System.out.println("Bracelet type is :"+bracelet.type);
		System.out.println("Bracelet metal is :"+bracelet.metal);
		System.out.println("Bracelet cost is :"+bracelet.cost);
		System.out.println("Bracelet weight is :"+bracelet.weight);
		System.out.println("Bracelet length is :"+bracelet.length);
		
		Bracelet bracelet1=new Bracelet("chained");
		System.out.println("Bracelet1 type is :"+bracelet1.type);
		System.out.println("Bracelet1 metal is :"+bracelet1.metal);
		System.out.println("Bracelet1 cost is :"+bracelet1.cost);
		System.out.println("Bracelet1 weight is :"+bracelet1.weight);
		System.out.println("Bracelet1 length is :"+bracelet1.length);
		
		Bracelet bracelet2=new Bracelet("chained","silver");
		System.out.println("Bracelet2 type is :"+bracelet2.type);
		System.out.println("Bracelet2 metal is :"+bracelet2.metal);
		System.out.println("Bracelet2 cost is :"+bracelet2.cost);
		System.out.println("Bracelet2 weight is :"+bracelet2.weight);
		System.out.println("Bracelet2 length is :"+bracelet2.length);
		
		Bracelet bracelet3=new Bracelet("chained","silver",999);
		System.out.println("Bracelet3 type is :"+bracelet3.type);
		System.out.println("Bracelet3 metal is :"+bracelet3.metal);
		System.out.println("Bracelet3 cost is :"+bracelet3.cost);
		System.out.println("Bracelet3 weight is :"+bracelet3.weight);
		System.out.println("Bracelet3 length is :"+bracelet3.length);
		
		Bracelet bracelet4=new Bracelet("chained","silver",999,10);
		System.out.println("Bracelet4 type is :"+bracelet4.type);
		System.out.println("Bracelet4 metal is :"+bracelet4.metal);
		System.out.println("Bracelet4 cost is :"+bracelet4.cost);
		System.out.println("Bracelet4 weight is :"+bracelet4.weight);
		System.out.println("Bracelet4 length is :"+bracelet4.length);
		
		Bracelet bracelet5=new Bracelet("chained","silver",999,20);
		System.out.println("Bracelet5 type is :"+bracelet5.type);
		System.out.println("Bracelet5 metal is :"+bracelet5.metal);
		System.out.println("Bracelet5 cost is :"+bracelet5.cost);
		System.out.println("Bracelet5 weight is :"+bracelet5.weight);
		System.out.println("Bracelet5 length is :"+bracelet5.length);
		
		System.out.println("Starting main in BraceletStarter");
		
	}
}