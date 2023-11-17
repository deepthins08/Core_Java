class PlantStarter{
	
	public static void main(String... planting){
		
		System.out.println("Strating main in PlantStarter");
		
		Food food=new Food();
		food.leaves();
		food.flavour();
		
		Plant plant=new Food();
		plant.leaves();
		
		Food food1=(Food)plant;
		food1.flavour();
		
		System.out.println("Ending main in PlantStarter");
	}
}