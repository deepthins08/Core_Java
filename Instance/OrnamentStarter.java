class OrnamentStarter{
	
	public static void main(String[] ornaments){
		
		System.out.println("Starting main in OrnamentStarter");
		Ornament ornament=new Ornament();
		System.out.println("Ornament name is :"+ornament.name);
		System.out.println("Ornament type is :"+ornament.type);
		System.out.println("Ornament material is :"+ornament.material);
		System.out.println("Ornament plating is :"+ornament.plating);
		
		Ornament ornament1=new Ornament("Jewellary");
		System.out.println("Ornament1 name is :"+ornament1.name);
		System.out.println("Ornament1 type is :"+ornament1.type);
		System.out.println("Ornament1 material is :"+ornament1.material);
		System.out.println("Ornament1 plating is :"+ornament1.plating);
		
		Ornament ornament2=new Ornament("Jewellary","Necklace");
		System.out.println("Ornament2 name is :"+ornament2.name);
		System.out.println("Ornament2 type is :"+ornament2.type);
		System.out.println("Ornament2 material is :"+ornament2.material);
		System.out.println("Ornament2 plating is :"+ornament2.plating);
		
		Ornament ornament3=new Ornament("Jewellary","Necklace","Alloy");
		System.out.println("Ornament3 name is :"+ornament3.name);
		System.out.println("Ornament3 type is :"+ornament3.type);
		System.out.println("Ornament3 material is :"+ornament3.material);
		System.out.println("Ornament3 plating is :"+ornament3.plating);
		
		Ornament ornament4=new Ornament("Jewellary","Necklace","Alloy","Gold Plating");
		System.out.println("Ornament4 name is :"+ornament4.name);
		System.out.println("Ornament4 type is :"+ornament4.type);
		System.out.println("Ornament4 material is :"+ornament4.material);
		System.out.println("Ornament4 plating is :"+ornament4.plating);
		
		System.out.println("Starting main in OrnamentStarter");
		
	}
}