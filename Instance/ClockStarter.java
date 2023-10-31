class ClockStarter{
	
	public static void main(String[] clocks){
		
		System.out.println("Starting main in ClockStarter");
		
		Clock clock=new Clock();
		System.out.println("clock type is: "+clock.type);
		System.out.println("clock noOfBatteries is: "+clock.noOfBatteries);
		System.out.println("clock brand is: "+clock.brand);
		System.out.println("clock wallClock is: "+clock.wallClock);
		
		
		Clock clock1=new Clock("Analog");
		System.out.println("clock type is: "+clock1.type);
		System.out.println("clock noOfBatteries is: "+clock1.noOfBatteries);
		System.out.println("clock brand is: "+clock1.brand);
		System.out.println("clock wallClock is: "+clock1.wallClock);
		
		Clock clock2=new Clock("Analog",2);
		System.out.println("clock type is: "+clock2.type);
		System.out.println("clock noOfBatteries is: "+clock2.noOfBatteries);
		System.out.println("clock brand is: "+clock2.brand);
		System.out.println("clock wallClock is: "+clock2.wallClock);
		
		
		Clock clock3=new Clock("Analog",2,"Ajantha");
		System.out.println("clock type is: "+clock3.type);
		System.out.println("clock noOfBatteries is: "+clock3.noOfBatteries);
		System.out.println("clock brand is: "+clock3.brand);
		System.out.println("clock wallClock is: "+clock3.wallClock);
		
		
		Clock clock4=new Clock("Analog",2,"Ajantha",true);
		System.out.println("clock type is: "+clock4.type);
		System.out.println("clock noOfBatteries is: "+clock4.noOfBatteries);
		System.out.println("clock brand is: "+clock4.brand);
		System.out.println("clock wallClock is: "+clock4.wallClock);
		System.out.println("Ending main in ClockStarter");
	}
}