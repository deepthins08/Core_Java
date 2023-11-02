class MonthStarter{
	
	public static void main(String[] months){
		
		System.out.println("Starting main in FreeStarter");
		
		Month month=new Month("January",31,5,7);
		month.displayInfo();
		
		Month month2=new Month("February",29,5,4);
		month2.displayInfo();
		
		Month month3=new Month("March",31,5,4);
		month3.displayInfo();
		
		Month month4=new Month("April",30,5,5);
		month4.displayInfo();
		
		Month month5=new Month("May",31,5,6);
		month5.displayInfo();
		
		Month month6=new Month("June",30,5,6);
		month6.displayInfo();
		
		Month month7=new Month("July",31,5,6);
		month7.displayInfo();
		
		Month month8=new Month("August",31,5,5);
		month8.displayInfo();
		
		Month month9=new Month("September",30,5,7);
		month9.displayInfo();
		
		Month month10=new Month("October",31,5,8);
		month10.displayInfo();
		
		Month month11=new Month("November",30,5,4);
		month11.displayInfo();
		
		Month month12=new Month("December",31,5,6);
		month12.displayInfo();
	}
}