class Static{

     Static(){
		 System.out.println("no arg consructor ");
	 }	
	 
	 static{
		 
		 System.out.println("hello im from static block");
	 }
	 
	 
	 public static void main(String[] args){
		 
		 Static stat=new Static();
	 }
	 
	 // this will print only 1.6 and older versions after versions it shows an error as
	 // Error: Main method not found in class Static, please define the main method as:
  // public static void main(String[] args)
//or a JavaFX application class must extend javafx.application.Application
	
}