class Dustbin{
	
	static void collectGarbage(){
		System.out.println("This is collectGarbage");
	}
	
	static void wetGarbage(){
		System.out.println("This is wetGarbage");
	}
	
	static void dryGarbage(){
		System.out.println("This is dryGarbage");
	}
	
	static void mixGarbage(){
		System.out.println("This is mixGarbage");
	}
	
	static void greenWaste(){
		System.out.println("This is greenWaste");
	}
	
	public static void main(String[] args){
		System.out.println("This is Main Class");
		collectGarbage();
		wetGarbage();
		dryGarbage();
		mixGarbage();
		greenWaste();
	}
}