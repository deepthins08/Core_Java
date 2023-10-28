class BakeryStarter{
	
	public static void main(String[] bakery){
		
		
    String bakeryName="Delecious Bakery";
	Bakery.setName(bakeryName);
	
	String[] bis={"Good day","Parle-G","Sunfeast","Darkfantacy","Hide and seek","Burbon"};
	Bakery.setBiscuits(bis);
	
	long[] contact={3877232978L,678657659L,6789890978L};
	Bakery.setContactNO(contact);
	
	String[] machine={"Refrigirator","Oven","AC","Computer"};
	Bakery.setMachines(machine);
	
	boolean lock=false;
	Bakery.setLocked(lock);
	
	String[] cake={"buttorscotch","venilla","Darkforest","WhiteForest","Redvalvet"};
	Bakery.setCakes(cake);
	
	String[] chocolate={"Eclairs","Dairymilk","kitkat","5star","sneaker"};
	Bakery.setChocolates(chocolate);
	
	Bakery.displayInfo();
	Bakery.locking();
	}
}