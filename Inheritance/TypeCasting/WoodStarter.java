class WoodStarter{
	
	public static void main(String... wooden){
		
		System.out.println("Starting main in WoodStarter");
		
		Bat bat=new Bat();
		bat.odour();
		bat.beet();
		Wood wood=new Bat();
		wood.odour();
		System.out.println("After typecaste");
		Bat bat1=(Bat)wood;
		bat1.odour();
		
		System.out.println("Ending main in WoodStarter");
	}
}