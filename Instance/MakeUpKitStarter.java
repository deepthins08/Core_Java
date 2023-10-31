class MakeUpKitStarter{
	
	public static void main(String[] makeover){
		
		System.out.println("Starting main in MakeUpKitStarter");
		MakeUpKit makeupkit=new MakeUpKit();
		System.out.println("MakeUpKit brand is :"+makeupkit.brand);
		System.out.println("MakeUpKit noOfItems is :"+makeupkit.noOfItems);
		System.out.println("MakeUpKit weight is :"+makeupkit.weight);
		System.out.println("MakeUpKit madeIn is :"+makeupkit.madeIn);
		
		MakeUpKit makeupkit1=new MakeUpKit("Sugar");
		System.out.println("MakeUpKit1 brand is :"+makeupkit1.brand);
		System.out.println("MakeUpKit1 noOfItems is :"+makeupkit1.noOfItems);
		System.out.println("MakeUpKit1 weight is :"+makeupkit1.weight);
		System.out.println("MakeUpKit1 madeIn is :"+makeupkit1.madeIn);
		
		MakeUpKit makeupkit2=new MakeUpKit("Sugar",15);
		System.out.println("MakeUpKit2 brand is :"+makeupkit2.brand);
		System.out.println("MakeUpKit2 noOfItems is :"+makeupkit2.noOfItems);
		System.out.println("MakeUpKit2 weight is :"+makeupkit2.weight);
		System.out.println("MakeUpKit2 madeIn is :"+makeupkit2.madeIn);
		
		MakeUpKit makeupkit3=new MakeUpKit("Sugar",15,60);
		System.out.println("MakeUpKit3 brand is :"+makeupkit3.brand);
		System.out.println("MakeUpKit3 noOfItems is :"+makeupkit3.noOfItems);
		System.out.println("MakeUpKit3 weight is :"+makeupkit3.weight);
		System.out.println("MakeUpKit3 madeIn is :"+makeupkit3.madeIn);
		
		MakeUpKit makeupkit4=new MakeUpKit("Sugar",15,60,"India");
		System.out.println("MakeUpKit4 brand is :"+makeupkit4.brand);
		System.out.println("MakeUpKit4 noOfItems is :"+makeupkit4.noOfItems);
		System.out.println("MakeUpKit4 weight is :"+makeupkit4.weight);
		System.out.println("MakeUpKit4 madeIn is :"+makeupkit4.madeIn);
		
		System.out.println("Starting main in MakeUpKitStarter ");
		
	}
	
}