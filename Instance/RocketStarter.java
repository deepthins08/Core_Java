class RocketStarter{
	
	public static void main(String[] launch){
		
		System.out.println("Starting main in RocketStarter");
		
		Rocket rocket=new Rocket();
		System.out.println("Rocket country is: "+rocket.country);
		System.out.println("Rocket name is: "+rocket.name);
		System.out.println("Rocket weight is: "+rocket.weight);
		System.out.println("Rocket height is: "+rocket.height);
		
		Rocket rocket1=new Rocket("india");
		System.out.println("Rocket1 country is: "+rocket1.country);
		System.out.println("Rocket1 name is: "+rocket1.name);
		System.out.println("Rocket1 weight is: "+rocket1.weight);
		System.out.println("Rocket1 height is: "+rocket1.height);
		
		Rocket rocket2=new Rocket("india","Chandrayan3");
		System.out.println("Rocket2 country is: "+rocket2.country);
		System.out.println("Rocket2 name is: "+rocket2.name);
		System.out.println("Rocket2 weight is: "+rocket2.weight);
		System.out.println("Rocket2 height is: "+rocket2.height);
		
		Rocket rocket3=new Rocket("india","Chandrayan3",80.56);
		System.out.println("Rocket3 country is: "+rocket3.country);
		System.out.println("Rocket3 name is: "+rocket3.name);
		System.out.println("Rocket3 weight is: "+rocket3.weight);
		System.out.println("Rocket3 height is: "+rocket3.height);
		
		Rocket rocket4=new Rocket("india","Chandrayan3",80.56,24);
		System.out.println("Rocket4 country is: "+rocket4.country);
		System.out.println("Rocket4 name is: "+rocket4.name);
		System.out.println("Rocket4 weight is: "+rocket4.weight);
		System.out.println("Rocket4 height is: "+rocket4.height);
		
		System.out.println("Starting main in RocketStarter");
	}
}