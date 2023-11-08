class PersonStarter{
	
	
	public static void main(String[] poeple){
		
		System.out.println("Starting main in PersonStarter");
		
		/***Domain domain=Domain.GMAIL;
		Email[] email=new Email(domain,"anthoony@gmail.com","Anthony","Duke");
		Person person=new Person("Anthony",email);
		person.name="anthony";
		Person person1=new Person("John",email);
		person1.email="johndepp@gmail.com";
		
		Person person2=new Person("Demon",email);
		person2.email="demonsalvetor@gmail";
		
		Email[] emailArray={person,person1,person2};***/
		Domain domain=Domain.GMAIL;
		//Email email=new Email(domain,"anthoony@gmail","Anthony","Duke");
		Email[] emailArray=new Email[3];
		System.out.println(emailArray[0]=email);
		
		Email email=new Email(domain,"anthoony@gmail","Anthony","Duke");
		email.showInfo();
		Person person=new Person("Anthony",emailArray);
		person.showInfo();
		
		
		
		
		System.out.println("Ending main in PersonStarter");
	}
}