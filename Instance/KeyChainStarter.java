class KeyChainStarter{
	
	public static void main(String[] keys){
		
		System.out.println("Starting main in KeyChainStarter");
		
		KeyChain keychain=new KeyChain();
		System.out.println("KeyChain color is :"+keychain.color);
		System.out.println("KeyChain color is :"+keychain.length);
		System.out.println("KeyChain color is :"+keychain.quantity);
		System.out.println("KeyChain color is :"+keychain.type);
		System.out.println("KeyChain color is :"+keychain.rating);
		
		KeyChain keychain1=new KeyChain("white");
		System.out.println("KeyChain1 color is :"+keychain1.color);
		System.out.println("KeyChain1 color is :"+keychain1.length);
		System.out.println("KeyChain1 color is :"+keychain1.quantity);
		System.out.println("KeyChain1 color is :"+keychain1.type);
		System.out.println("KeyChain1 color is :"+keychain1.rating);
		
		KeyChain keychain2=new KeyChain("white",9);
		System.out.println("KeyChain2 color is :"+keychain2.color);
		System.out.println("KeyChain2 color is :"+keychain2.length);
		System.out.println("KeyChain2 color is :"+keychain2.quantity);
		System.out.println("KeyChain2 color is :"+keychain2.type);
		System.out.println("KeyChain2 color is :"+keychain2.rating);
		
		KeyChain keychain3=new KeyChain("white",9,3);
		System.out.println("KeyChain3 color is :"+keychain3.color);
		System.out.println("KeyChain3 color is :"+keychain3.length);
		System.out.println("KeyChain3 color is :"+keychain3.quantity);
		System.out.println("KeyChain3 color is :"+keychain3.type);
		System.out.println("KeyChain3 color is :"+keychain3.rating);
		
		KeyChain keychain4=new KeyChain("white",9,3,"Shaktiman");
		System.out.println("KeyChain4 color is :"+keychain4.color);
		System.out.println("KeyChain4 color is :"+keychain4.length);
		System.out.println("KeyChain4 color is :"+keychain4.quantity);
		System.out.println("KeyChain4 color is :"+keychain4.type);
		System.out.println("KeyChain4 color is :"+keychain4.rating);
		
		KeyChain keychain5=new KeyChain("white",9,3,"Shaktiman",3);
		System.out.println("KeyChain5 color is :"+keychain5.color);
		System.out.println("KeyChain5 color is :"+keychain5.length);
		System.out.println("KeyChain5 color is :"+keychain5.quantity);
		System.out.println("KeyChain5 color is :"+keychain5.type);
		System.out.println("KeyChain5 color is :"+keychain5.rating);
		
		System.out.println("Starting main in KeyChainStarter");
		
	}
	
}