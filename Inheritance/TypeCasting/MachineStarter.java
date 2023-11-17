class MachineStarter{
	
	public static void main(String... machines){
		
		System.out.println("Starting main in MachineStarter");
		
		Generator generator=new Generator();
		generator.start();
		generator.powerSupply();
		
		Machine machine=new Generator();
		machine.start();
		
		Generator generator1=(Generator)machine;
		generator1.powerSupply();
		
		
		
		
		System.out.println("Ending main in MachineStarter");
	}
}